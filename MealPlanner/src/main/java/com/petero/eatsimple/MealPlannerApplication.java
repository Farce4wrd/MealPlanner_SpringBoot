package com.petero.eatsimple;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.petero.eatsimple.data.ItemRepository;
import com.petero.eatsimple.data.MealRepository;
import com.petero.eatsimple.models.Item;
import com.petero.eatsimple.models.Meal;
import com.petero.eatsimple.services.MealService;


@SpringBootApplication
@EnableJpaAuditing
public class MealPlannerApplication {
	private static Logger LOG = LoggerFactory.getLogger(MealPlannerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(MealPlannerApplication.class, args);
	}
	
	/*@Bean
	public CommandLineRunner mappingDemo(MealRepository mealRepository, ItemRepository itemRepository, MealService mealService) {
		
		
		
		
		return args ->{
			Item tomato = new Item(10L, "tomato", 12, 10);
			Item rice = new Item(20L, "rice", 14, 30);
			
			List<Item> itemList = new ArrayList<Item>();
			itemList.add(tomato);
			itemList.add(rice);
			
			Meal myMeal = new Meal(20L, itemList, "Rice and Stew", 200, 250, 2000);
			LOG.info("This is it");
			mealRepository.save(myMeal);
			//LOG.info(mealService.getItemNames(myMeal));
		};
	}
	*/
	
}
