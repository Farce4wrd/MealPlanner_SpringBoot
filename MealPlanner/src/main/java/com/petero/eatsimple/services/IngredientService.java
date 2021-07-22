package com.petero.eatsimple.services;

import java.util.ArrayList;

import java.util.List;
import org.springframework.stereotype.Service;

import com.petero.eatsimple.data.IngredientRepository;
import com.petero.eatsimple.models.Ingredient;

@Service
public class IngredientService {
		
	private final IngredientRepository ingredientRepository;
	
	
	public IngredientService(IngredientRepository ingredientRepository){
		this.ingredientRepository = ingredientRepository;
	}
	

	

}
