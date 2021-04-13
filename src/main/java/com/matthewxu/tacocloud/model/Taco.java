
package com.matthewxu.tacocloud.model;

import java.util.List;

/**
 * Description:
 * @author Matthew Xu
 * @date Apr 12, 2021
 */
public class Taco {

	private String name;
	
	private List<String> ingredients;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<String> ingredients) {
		this.ingredients = ingredients;
	}
	
	
}
