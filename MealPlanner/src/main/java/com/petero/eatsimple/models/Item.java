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
	@JoinColumn(name ="MEAL_ID")
	private Meal meal;
	
	public Item() {
		
	}
	
	@Autowired
	public Item(Long id, String name, Integer cost, Integer calories) {
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.calories = calories;
	}
	public long getId() {
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

}
