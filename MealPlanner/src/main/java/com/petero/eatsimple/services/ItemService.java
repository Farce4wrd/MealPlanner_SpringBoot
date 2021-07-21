package com.petero.eatsimple.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petero.eatsimple.data.ItemRepository;
import com.petero.eatsimple.models.Item;

@Service
public class ItemService {
		
	private final ItemRepository itemRepository;
	
	@Autowired
	public ItemService(ItemRepository itemRepository){
		this.itemRepository = itemRepository;
	}
	
	public List<Item> getItems(){
		List<Item> itemList = new ArrayList();
		for(Item item: this.itemRepository.findAll()) {
			itemList.add(item);
		}
		return itemList;
	}
	public Item addItem(Item item) {
		return itemRepository.save(item);
	}
	public void delItem(Item item) {
		this.itemRepository.delete(item);
	}
	
	

}
