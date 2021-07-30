package com.petero.eatsimple.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Document(collection = "meals")
public class Meal implements Serializable {


	@Id
	private String id;

	private String name;
	
	private Integer marketCost;
	
	private Integer overallCost;

	private Integer mealCalories;
	
	@JsonIgnore
	private List<Ingredient> ingredients = new ArrayList<>();
	
	
	public Meal() {
		
	}
	
	public Meal(String id, String name, Integer marketCost, Integer overallCost, Integer menuCalories) {
		this.id = id;
		this.name = name;
		this.overallCost = overallCost;
		this.marketCost = marketCost;
		this.mealCalories = menuCalories;
		
	}

	/*
	 * public List<Item> getItems() { return items; }
	 * 
	 * public void setItems(List<Item> items) { this.items = items; }
	 */

	@Override
	public String toString() {
		return "Meal [id=" + id + ", name=" + name + ", marketCost=" + marketCost + ", overallCost=" + overallCost
				+ ", mealCalories=" + mealCalories + ", items=" + ingredients + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getMarketCost() {
		return marketCost;
	}

	public void setMarketCost(Integer marketCost) {
		this.marketCost = marketCost;
	}

	public Integer getOverallCost() {
		return overallCost;
	}

	public void setOverallCost(Integer overallCost) {
		this.overallCost = overallCost;
	}

	public Integer getMealCalories() {
		return mealCalories;
	}

	public void setMealCalories(Integer menuCalories) {
		this.mealCalories = menuCalories;
	}

	
	

}
