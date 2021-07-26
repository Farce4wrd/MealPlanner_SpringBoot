package com.petero.eatsimple.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.petero.eatsimple.models.Meal;
import com.petero.eatsimple.services.MealService;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping(MealRestController.MEAL)
@CrossOrigin
public class MealRestController {
	
	public static final String MEAL = "/meal";
	
	@GetMapping(path = "{mealId}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Mono<String> getMealById(@PathVariable String mealId){
		
		//mealService.getMeal(mealId)
		return Mono.just("{}");
	}
	
	@Autowired
	private MealService mealService;
	
	
	
	/*@RequestMapping("/api/meals/item")
	public List<String> getMealByItem(){
		return this.mealService.getItemNames();
	}*/
	
	

}
