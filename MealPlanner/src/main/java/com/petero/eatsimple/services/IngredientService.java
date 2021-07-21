package com.petero.eatsimple.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petero.eatsimple.data.IngredientRepository;
import com.petero.eatsimple.models.Ingredient;

@Service
public class IngredientService {
		
	private final IngredientRepository ingredientRepository;
	
	@Autowired
	public IngredientService(IngredientRepository ingredientRepository){
		this.ingredientRepository = ingredientRepository;
	}
	
	public List<Ingredient> getIngredients(){
		List<Ingredient> ingredientList = new ArrayList();
		for(Ingredient ingredient: this.ingredientRepository.findAll()) {
			ingredientList.add(ingredient);
		}
		return ingredientList;
	}
	public Ingredient addIngredient(Ingredient ingredient) {
		return ingredientRepository.save(ingredient);
	}
	public void delIngredient(Ingredient ingredient) {
		this.ingredientRepository.delete(ingredient);
	}
	
	

}
