package com.example.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.FoodItem;
import com.example.demo.repository.FoodItemRepository;

@Service
public class FoodItemDAO {
	
	@Autowired
	FoodItemRepository foodItemRepository;
	
	public FoodItem save(FoodItem item) {
		return foodItemRepository.save(item);
	}
}
