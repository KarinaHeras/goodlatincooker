package com.goodlatincooker.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.goodlatincooker.service.model.entities.CookingRecipe;
import com.goodlatincooker.service.model.service.CookingRecipeService;

@RestController
@RequestMapping("/api/v1/cooking-recipe")
public class CookingRecipeController {

	@Autowired
	CookingRecipeService crService; 
	
	@GetMapping(value = "/list")
	public ResponseEntity<?>  listAll(){
		return ResponseEntity.ok(this.crService.findAll()) ;		
	}
	
	@PostMapping(value = "/add")
	public ResponseEntity<?>  create(@RequestBody CookingRecipe cookingRecipe){
		if (cookingRecipe.getId() != null)  return ResponseEntity.badRequest().build(); 
		return ResponseEntity.ok(this.crService.save(cookingRecipe)) ;		
	}
	
	@PutMapping(value = "/add")
	public ResponseEntity<?> update(@RequestBody CookingRecipe cookingRecipe){
		if (cookingRecipe.getId() == null)  return ResponseEntity.badRequest().build();
		return ResponseEntity.ok(this.crService.save(cookingRecipe));		
	}

	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity<?>  delete(@PathVariable("id") Integer id){
		this.crService.deleteById(id);
		return ResponseEntity.ok(true) ;		
	}
}
