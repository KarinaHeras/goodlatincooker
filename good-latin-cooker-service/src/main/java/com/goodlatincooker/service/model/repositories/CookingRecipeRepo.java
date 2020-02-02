package com.goodlatincooker.service.model.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.goodlatincooker.service.model.entities.CookingRecipe;

@Repository
public interface CookingRecipeRepo extends CrudRepository<CookingRecipe, Integer> {
	List<CookingRecipe> findByPeople(Integer people);
}
