package com.petero.eatsimple.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="MEAL")
public class Meal implements Serializable {
	
	


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="MEAL_ID")
	private Long id;
	@Column(name="MEAL_NAME")
	private String name;
	@Column(name="MARKET_COST")
	private Integer marketCost;
	@Column(name="OVERALL_COST")
	private Integer overallCost;
	@Column(name="MEAL_CALORIES")
	private Integer mealCalories;
	
	@JsonIgnore
	@OneToMany(mappedBy="meal", fetch= FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Item> items = new ArrayList<>();
	
	
	public Meal() {
		
	}
	
	public Meal(Long id, String name, Integer marketCost, Integer overallCost, Integer menuCalories) {
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
				+ ", mealCalories=" + mealCalories + ", items=" + items + "]";
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
