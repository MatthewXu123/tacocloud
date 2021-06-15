package com.matthewxu.tacocloud.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.matthewxu.tacocloud.model.Ingredient;

@Repository
public interface IngredientRepository2 extends CrudRepository<Ingredient, String>{

	
}
