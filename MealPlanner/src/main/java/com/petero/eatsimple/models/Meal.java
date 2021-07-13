package com.petero.eatsimple.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="MEAL")
public class Meal implements Serializable {
	
	


	@Id
	@Column(name="ID")
	private Long id;
	@Column(name="MEAL_NAME")
	private String name;
	@Column(name="MARKET_COST")
	private Integer marketCost;
	@Column(name="OVERALL_COST")
	private Integer overallCost;
	@Column(name="MEAL_CALORIES")
	private Integer mealCalories;
	
	@OneToMany(mappedBy="meal", fetch= FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Item> items;
	
	
	public Meal() {
		
	}
	
	public Meal(Long id, List<Item> items, String name, Integer marketCost, Integer overallCost, Integer menuCalories) {
		this.id = id;
		this.items = items;
		this.name = name;
		this.overallCost = overallCost;
		this.marketCost = marketCost;
		this.mealCalories = menuCalories;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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
