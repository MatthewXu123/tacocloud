package com.matthewxu.tacocloud.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.matthewxu.tacocloud.dao.IngredientRepository;
import com.matthewxu.tacocloud.model.Ingredient;

@Repository
public class JdbcIngredientRepository implements IngredientRepository{

	@Autowired
	private JdbcTemplate jdbc;
	
	@Override
	public Iterable<Ingredient> findAll() {
		return jdbc.query("select * from Ingredient", this::mapRowToIngredient);
	}

	@Override
	public Ingredient findOne(String id) {
		return jdbc.queryForObject("select * from Ingredient", this::mapRowToIngredient, id);
	}

	@Override
	public Ingredient save(Ingredient ingredient) {
		jdbc.update("insert into Ingredient values(?,?,?)",
				ingredient.getId(),
				ingredient.getName(),
				ingredient.getType().toString());
		return ingredient;
	}

	private Ingredient mapRowToIngredient(ResultSet rs, int rowNum) throws SQLException{
		return new Ingredient(rs.getString("id"), 
				rs.getString("name"), 
				Ingredient.Type.valueOf(rs.getString("type")));
	}
}
