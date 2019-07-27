package service;

import java.util.Hashtable;

import org.springframework.stereotype.Service;

import model.FoodItem;

@Service
public class FoodService {
	Hashtable<String, FoodItem> foodItems = new Hashtable<String, FoodItem>();

	public Hashtable<String, FoodItem> GetAllFoodItems() {
		FoodItem foodItem = new FoodItem();
		foodItem.setName("Rice with fish");
		foodItems.put("1", foodItem);
		
		return foodItems;
	}
}
