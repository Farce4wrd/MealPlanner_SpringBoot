package com.petero.eatsimple.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.ReactiveMongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.petero.eatsimple.models.Ingredient;

import reactor.core.publisher.Mono;

@Service
public class IngredientServiceImpl implements IngredientService {

	private final ReactiveMongoOperations reactiveMongoOperations;
	
	@Autowired
	public IngredientServiceImpl(ReactiveMongoOperations reactiveMongoOperations) {
		this.reactiveMongoOperations = reactiveMongoOperations;
	}

	@Override
	public Mono<Ingredient> getIngredient(String ingredientId) {
		return reactiveMongoOperations.findById(ingredientId, Ingredient.class);
	}

	@Override
	public Mono<Ingredient> createIngredient(Mono<Ingredient> ingredientMono) {
		return reactiveMongoOperations.save(ingredientMono);
	}

	@Override
	//This method has an upsert property to it but I'm just making it specific 
	public Mono<Ingredient> updateIngredient(String ingredientId, Mono<Ingredient> ingredientMono) {
		// Upsert functionality
		//essentially locate by id, replace/update cost and return the resulting ingredient mono
		return ingredientMono.flatMap(ingredient ->reactiveMongoOperations.findAndModify(
				Query.query(Criteria.where("id").is(ingredientId)),
				Update.update("cost", ingredient.getCost()), Ingredient.class
				).flatMap(result ->{
					return Mono.just(result);
				})
		);
	}

	@Override
	public Mono<Boolean> deleteIngredient(String ingredientId) {
		
		return reactiveMongoOperations.remove(
				Query.query(Criteria.where("id").is(ingredientId)), Ingredient.class)
				.flatMap(deleteResult -> Mono.just(deleteResult.wasAcknowledged()));
	}
	

}
