
package com.matthewxu.tacocloud.model;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Description:
 * @author Matthew Xu
 * @date Apr 12, 2021
 */
public class Taco {

	@NotNull
	@Size(min = 5, message = "The length > 5")
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
