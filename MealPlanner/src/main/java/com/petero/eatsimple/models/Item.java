package com.petero.eatsimple.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;



@Entity
@Table(name = "ITEM")
public class Item implements Serializable {
	
	@Id
	@Column(name="ITEM_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="ITEM_NAME")
	private String name;
	@Column(name="ITEM_COST")
	private Integer cost;
	@Column(name="ITEM_CALORIES")
	private Integer calories;
	
	@ManyToOne
	@JoinColumn(name ="ID")
	private Meal meal;
	
	public Item() {
		
	}
	
	@Autowired
	public Item(String name, Integer cost, Integer calories, Meal meal) {
	
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
