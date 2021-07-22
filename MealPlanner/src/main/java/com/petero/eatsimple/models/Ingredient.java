package com.petero.eatsimple.models;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection ="ingredients")
public class Ingredient implements Serializable {

	@Id
	private Long id;
	
	private String name;
	
	private Integer cost;
	
	private Integer calories;


	private Meal meal;

	public Ingredient() {

	}

	@Autowired
	public Ingredient(Long id, String name, Integer cost, Integer calories, Meal meal) {
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.calories = calories;
		this.meal = meal;
	}

	public Meal getMeal() {
		return this.meal;
	}

	public void setMeal(Meal meal) {
		this.meal = meal;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCost() {
		return cost;
	}

	public void setCost(Integer cost) {
		this.cost = cost;
	}

	public Integer getCalories() {
		return calories;
	}

	public void setCalories(Integer calories) {
		this.calories = calories;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", cost=" + cost + ", calories=" + calories + ", meal=" + meal
				+ "]";
	}

}
