package controller;

import java.util.Hashtable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.FoodItem;
import service.FoodService;

@RestController
@RequestMapping("/food")
public class FoodItemController {
	@Autowired
	FoodService fs;
	
	@RequestMapping("/list")
	public Hashtable<String, FoodItem> getAll() {
		return fs.GetAllFoodItems();
	}
}
