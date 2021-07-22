package com.petero.eatsimple.data;


import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.petero.eatsimple.models.Ingredient;

@Repository
public interface IngredientRepository extends ReactiveMongoRepository<Ingredient, Long> {
	

}
