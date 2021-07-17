package com.petero.eatsimple.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petero.eatsimple.data.ItemRepository;
import com.petero.eatsimple.models.Item;

@Service
public class ItemService {
	
	@Autowired	
	private ItemRepository itemRepository;
	
	public List<Item> getItemsInList(){
		List<Item> itemList = new ArrayList();
		for(Item item: this.itemRepository.findAll()) {
			itemList.add(item);
		}
		return itemList;
	}

}
