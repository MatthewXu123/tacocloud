package com.matthewxu.tacocloud.dao;

import com.matthewxu.tacocloud.model.Ingredient;

public interface IngredientRepository {

	Iterable<Ingredient> findAll();
	
	Ingredient findOne(String id);
	
	Ingredient save(Ingredient ingredient);
}
