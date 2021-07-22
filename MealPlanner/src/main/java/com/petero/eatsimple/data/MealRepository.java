package com.petero.eatsimple.data;

import java.util.List;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.petero.eatsimple.models.Ingredient;
import com.petero.eatsimple.models.Meal;
@Repository
public interface MealRepository extends ReactiveMongoRepository<Meal, Long> {
	//Testing 
	List<Meal> findByingredientsIn(List<Ingredient> ingredients);

}
