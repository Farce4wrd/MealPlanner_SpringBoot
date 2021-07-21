package com.petero.eatsimple.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petero.eatsimple.data.MealRepository;
import com.petero.eatsimple.models.Meal;

@Service
public class MealService {
	private final MealRepository mealRepository;
	
	@Autowired
	public MealService(MealRepository mealRepository) {
		this.mealRepository = mealRepository;
	}
	
	
	
	public List<Meal> getAll(){
		return mealRepository.findAll();
	}
	//Trying to get the List of item objects
	//Extract the names of those item object and place it inside a list that thymeleaf can select 
	/*public String getItemNames(Meal meals){
		
		//holder of item names for a meal
		List<String> names = new ArrayList<>();
		//current Item in list -- get items list of meal object and now we're extracting the names of each item
		
		Iterable<Item> currItem = this.mealRepository.findById();
		for(Item item: currItem) {
			names.add(item.getName());
		}
		StringBuilder itemNames = new StringBuilder();
		for(String str: names) {
			itemNames.append(str);
			itemNames.append(", ");
		}
		
		/*currItem.forEach(curr->{
			//This gets the item names for each item in a meal
			System.out.print("Is this string: "+ curr.getName());
			names.add(curr.getName());
		});
		/
		String str= itemNames.toString();
		
		return str;
	}*/
}
