package com.petero.eatsimple.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.petero.eatsimple.services.MealService;



@Controller
@RequestMapping("/meals")
public class MealController {

	@Autowired
	private MealService mealService;
	
	public MealController(MealService mealService) {
		this.mealService = mealService;
	}
	
	
	
}
