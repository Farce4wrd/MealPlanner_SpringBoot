package com.petero.eatsimple.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.petero.eatsimple.data.MealRepository;
import com.petero.eatsimple.models.Meal;
import com.petero.eatsimple.services.MealService;

@RestController
@RequestMapping("/api/meals")
public class MealRestController {
	
	@Autowired
	private MealService mealService;
	
	
	
	/*@RequestMapping("/api/meals/item")
	public List<String> getMealByItem(){
		return this.mealService.getItemNames();
	}*/
	
	@GetMapping
	public @ResponseBody List<Meal> getAllOfEm(){
		return mealService.getAll();
	}

}
