
package com.matthewxu.tacocloud.dao.impl;

import java.sql.Timestamp;
import java.sql.Types;
import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.PreparedStatementCreatorFactory;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.matthewxu.tacocloud.dao.TacoRepository;
import com.matthewxu.tacocloud.model.Ingredient;
import com.matthewxu.tacocloud.model.Taco;

/**
 * Description:
 * @author Matthew Xu
 * @date Jun 7, 2021
 */
@Repository
public class JdbcTacoRepository implements TacoRepository{

	@Autowired
	private JdbcTemplate jdbc;
	
	@Override
	public Taco save(Taco taco) {
		long tacoId = saveTacoInfo(taco);
		taco.setId(tacoId);
		for(Ingredient ingredient : taco.getIngredients()) {
			saveIngredientToTaco(ingredient, tacoId);
		}
		return taco;
	}

	private long saveTacoInfo(Taco taco){
		taco.setCreatedAt(new Date());
		PreparedStatementCreator psc = new PreparedStatementCreatorFactory("INSERT INTO taco VALUES(?,?)", 
				Types.VARCHAR, 
				Types.TIMESTAMP).
		newPreparedStatementCreator(Arrays.asList(taco.getName(), new Timestamp(taco.getCreatedAt().getTime())));
		KeyHolder keyHolder = new GeneratedKeyHolder();
		jdbc.update(psc, keyHolder);
		return keyHolder.getKey().longValue();
	}
	
	private void saveIngredientToTaco(Ingredient ingredient, long tacoId){
		jdbc.update("INSERT INTO taco_ingredients VALUES (?,?) ", tacoId, ingredient.getId());
	}
}
