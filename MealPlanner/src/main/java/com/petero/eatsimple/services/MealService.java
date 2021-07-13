package com.petero.eatsimple.services;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Service;

import com.petero.eatsimple.data.MealRepository;
import com.petero.eatsimple.models.Meal;
import com.petero.eatsimple.models.Item;

@Service
public class MealService {
	private MealRepository mealRepository;
	
	public MealService(MealRepository mealRepository) {
		this.mealRepository = mealRepository;
	}
	
	public Iterable<Meal> getAll(){
		return mealRepository.findAll();
	}
	//Trying to get the List of item objects
	//Extract the names of those item object and place it inside a list that thymeleaf can select 
	public List<String> getItemNames(Meal meals){
		
		//holder of item names for a meal
		List<String> names = new ArrayList<>();
		//current Item in list -- get items list of meal object and now we're extracting the names of each item
		
		Iterable<Item> currItem = this.mealRepository.findById(meals.getId());
		for(Item item: currItem) {
			names.add(item.getName());
		}
		
		/*currItem.forEach(curr->{
			//This gets the item names for each item in a meal
			System.out.print("Is this string: "+ curr.getName());
			names.add(curr.getName());
		});
		*/
		
		return names;
	}
}
