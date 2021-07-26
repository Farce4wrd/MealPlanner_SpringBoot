package com.petero.eatsimple.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.petero.eatsimple.models.Ingredient;
import com.petero.eatsimple.services.IngredientService;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping(IngredientRestController.MEAL_INGREDIENTS)
@CrossOrigin //Will help run spring and angular locally despite them on different origins. Potential security issue
public class IngredientRestController {
	
	public static final String MEAL_INGREDIENTS = "/meal/ingredients/";
	@Autowired
	private IngredientService ingredientService;
	
	@GetMapping(path="{ingredientId}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	//Temp changing return type to string
	public Mono<String> getIngredientById(@PathVariable Long ingredientId){
		
		//ingredientService.getIngredient(ingredientId);
		return Mono.just("{}");
	}
	@PostMapping(path = "", produces= MediaType.APPLICATION_JSON_UTF8_VALUE, consumes= MediaType.APPLICATION_JSON_UTF8_VALUE)
	//RequestBody will take the JSON rb into ingredient obj
	public Mono<String> createIngredient(@RequestBody Mono<Ingredient> ingredient){
		
		return Mono.just("{}");
	}
	
	@PutMapping(path = "{ingredientId}",  produces= MediaType.APPLICATION_JSON_UTF8_VALUE, consumes= MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Mono<String> updateCost(@PathVariable String ingredientId ,@RequestBody Mono<Ingredient> ingredient){
		
		return Mono.just("{}");
	}
	
	@DeleteMapping(path = "{ingredientId}")
	public Mono<Boolean> deleteIngredient(@PathVariable String ingredientId){
		
		return Mono.just(true);
		
	}


}
