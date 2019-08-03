package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.FoodItem;

@Repository
public interface FoodItemRepository extends CrudRepository<FoodItem, Integer> {

}
