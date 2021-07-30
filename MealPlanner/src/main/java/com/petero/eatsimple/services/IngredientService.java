package com.petero.eatsimple.services;

import com.petero.eatsimple.models.Ingredient;

import reactor.core.publisher.Mono;

public interface IngredientService {
	
	Mono<Ingredient> getIngredient(String ingredientId);
	
	Mono<Ingredient> createIngredient(Mono<Ingredient> ingredientMono);
	
	Mono<Ingredient> updateIngredient(String ingredientId, Mono<Ingredient> ingredientMono);
	
	Mono<Boolean> deleteIngredient(String ingredientId); 
	

}
