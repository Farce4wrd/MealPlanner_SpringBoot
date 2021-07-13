package com.petero.eatsimple.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.petero.eatsimple.models.Item;
import com.petero.eatsimple.models.Meal;
import com.petero.eatsimple.services.MealService;
import com.petero.eatsimple.data.MealRepository;
import com.petero.eatsimple.data.ItemRepository;

@RestController
@RequestMapping("/api/meals")
public class MealRestController {
	
	@Autowired
	public MealService mealService;
	
	@Autowired
	public MealRepository mealRepository;
	
	/*@RequestMapping("/api/meals/item")
	public Iterable<Item> getAlli(){
		return this.mealService.getItemNames();
	}*/
	
	@GetMapping
	public Iterable<Meal> getAllOfEm(){
		return this.mealRepository.findAll();
	}

}
