package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.FoodItem;
import com.example.demo.model.FoodItemNotFoundException;
import com.example.demo.service.FoodService;

@RestController
@RequestMapping("/food")
public class FoodItemController {
	@Autowired
	FoodService fs;
	
	@RequestMapping("/list")
	public List<FoodItem> getAll() {
		return fs.GetAllFoodItems();
	}
	
	@PostMapping("/add-new")
	public FoodItem addItem(@Valid @RequestBody FoodItem foodItem) {
		return fs.save(foodItem);
	}

	@GetMapping(value = "/{id}")
	public Optional <FoodItem> retreiveItem(@PathVariable("id") Long id) throws FoodItemNotFoundException {
		return fs.getFoodItem(id);
	}
}