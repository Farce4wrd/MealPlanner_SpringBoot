package com.petero.eatsimple.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.petero.eatsimple.models.Item;
import com.petero.eatsimple.models.Meal;
@Repository
public interface MealRepository extends JpaRepository<Meal, Long> {
	//Testing 
	@Query("Select c from Meal c join c.items i where i.id = ?1")
	List<Meal> findByitems(Long id);
	List<Meal> findByitemsIn(List<Item> items);

}
