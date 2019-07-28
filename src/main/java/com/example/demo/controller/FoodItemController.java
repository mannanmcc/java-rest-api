package com.example.demo.controller;

import java.util.Hashtable;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.FoodItem;
import com.example.demo.service.FoodService;

@RestController
@RequestMapping("/food")
public class FoodItemController {
	@Autowired
	FoodService fs;
	
	@RequestMapping("/list")
	public Hashtable<String, FoodItem> getAll() {
		return fs.GetAllFoodItems();
	}
	
	@PostMapping("/add-new")
	public FoodItem addItem(@Valid @RequestBody FoodItem foodItem) {
		return fs.save(foodItem);
	}
}
