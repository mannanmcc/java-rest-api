package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.FoodItem;
import com.example.demo.repository.FoodItemRepository;

@Service
public class FoodService {
	@Autowired
	FoodItemRepository foodItemRepository;

	public List<FoodItem> GetAllFoodItems() {
		return foodItemRepository.findAll();
	}

	public FoodItem save(FoodItem item) {
		return foodItemRepository.save(item);
	}
}
