package com.goodlatincooker.service.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goodlatincooker.service.model.entities.CookingRecipe;
import com.goodlatincooker.service.model.repositories.CookingRecipeRepo;

@Service
public class CookingRecipeService implements CookingRecipeRepo {

	@Autowired
	CookingRecipeRepo crRepo;

	@Override
	public <S extends CookingRecipe> S save(S entity) {
		return crRepo.save(entity);
	}

	@Override
	public <S extends CookingRecipe> Iterable<S> saveAll(Iterable<S> entities) {
		return crRepo.saveAll(entities);
	}

	@Override
	public Optional<CookingRecipe> findById(Integer id) {
		return crRepo.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return crRepo.existsById(id);
	}

	@Override
	public Iterable<CookingRecipe> findAll() {
		return crRepo.findAll();
	}

	@Override
	public Iterable<CookingRecipe> findAllById(Iterable<Integer> ids) {
		return crRepo.findAllById(ids);
	}

	@Override
	public long count() {
		return crRepo.count();
	}

	@Override
	public void deleteById(Integer id) {
		crRepo.deleteById(id);
	}

	@Override
	public void delete(CookingRecipe entity) {
		crRepo.delete(entity);
	}

	@Override
	public void deleteAll(Iterable<? extends CookingRecipe> entities) {
		crRepo.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		crRepo.deleteAll();
	}

	@Override
	public List<CookingRecipe> findByPeople(Integer people) {
		return crRepo.findByPeople(people);
	}

}
