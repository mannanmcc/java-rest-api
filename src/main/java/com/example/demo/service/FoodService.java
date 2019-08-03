package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.FoodItem;
import com.example.demo.model.FoodItemNotFoundException;
import com.example.demo.repository.FoodItemRepository;

@Service
public class FoodService {
	@Autowired
	FoodItemRepository foodItemRepository;

	public List<FoodItem> GetAllFoodItems() {
		List<FoodItem> items = new ArrayList<>();
		
		for (FoodItem item: foodItemRepository.findAll()) {
			items.add(item);
		}
		
		return items;
	}

	public FoodItem save(FoodItem item) {
		return foodItemRepository.save(item);
	}

	public Optional <FoodItem> getFoodItem(int itemId) throws FoodItemNotFoundException {
        Optional <FoodItem> item = foodItemRepository.findById(itemId);
        if (item == null) {
        	throw new FoodItemNotFoundException("Food item not found for id-" + itemId);
        }

        return item;
    }

	public void removeItem(int itemId) {
		foodItemRepository.deleteById(itemId);
	}
}
