package com.petero.eatsimple.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.ReactiveMongoOperations;
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
	public Mono<Ingredient> updateIngredient(String id, Mono<Ingredient> ingredientMono) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<Boolean> deleteIngredient(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
