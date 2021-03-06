package com.petero.eatsimple.data;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.petero.eatsimple.models.Item;
import com.petero.eatsimple.models.Meal;
@Repository
public interface MealRepository extends JpaRepository<Meal, String> {
	List<Item> findById(Long id);

}
