package com.goodlatincooker.service.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name = "t_cooking_recipe")
public class CookingRecipe implements Serializable {

	private static final long serialVersionUID = 4917641626613329996L;

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	
	@Column(length = 150, nullable = false)
	String title;
	@Column(length = 4000)
	String description;
	@Column(name = "cooking_duration")
	Integer cookingDuration;
	Integer people;
	Byte[] image;
	
	
}
