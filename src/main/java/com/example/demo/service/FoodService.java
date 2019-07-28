package com.example.demo.service;

import java.util.Hashtable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.FoodItem;
import com.example.demo.repository.FoodItemRepository;

@Service
public class FoodService {
	@Autowired
	FoodItemRepository foodItemRepository;

	Hashtable<String, FoodItem> foodItems = new Hashtable<String, FoodItem>();

	public Hashtable<String, FoodItem> GetAllFoodItems() {
		FoodItem foodItem = new FoodItem();
		foodItem.setName("Rice with fish");
		foodItems.put("1", foodItem);
		
		return foodItems;
	}

	public FoodItem save(FoodItem item) {
		return foodItemRepository.save(item);
	}
}
