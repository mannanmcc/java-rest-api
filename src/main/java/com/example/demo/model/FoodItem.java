package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@SuppressWarnings("deprecation")
@Entity
@Table(name="food_item")
@EntityListeners(AuditingEntityListener.class)
public class FoodItem {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;

	@NotBlank
	String name;

	@NotBlank
	String description;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}