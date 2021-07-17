package com.petero.eatsimple.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.petero.eatsimple.models.Item;
import com.petero.eatsimple.services.ItemService;

@RestController
@RequestMapping("/api/items")
public class ItemRestController {
	
	@Autowired
	private ItemService itemService;
	
	@GetMapping
	public List<Item> getAll(){
		return this.itemService.getItemsInList();
	}

}
