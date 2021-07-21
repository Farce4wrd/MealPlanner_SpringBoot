package com.petero.eatsimple.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.petero.eatsimple.models.Ingredient;
import com.petero.eatsimple.models.Meal;
import com.petero.eatsimple.services.IngredientService;

@RestController
@RequestMapping("/api/items")
public class IngredientRestController {
	
	@Autowired
	private IngredientService ingredientService;
	
	@GetMapping
	public List<Ingredient> getAll(){
		return this.ingredientService.getIngredients();
	}
	
//	@GetMapping(value= "/update/{name}")
//	public List<Item> update(@PathVariable final String name){
//		Meal meal = new Meal();
//		meal.setName(name)
//	}

}
