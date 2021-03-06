
package com.matthewxu.tacocloud.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Description:
 * @author Matthew Xu
 * @date Mar 29, 2021
 */
@Entity
public class Ingredient {
	
	@Id
	private String id;
	
	private String name;
	
	private Type type;
	
	public static enum Type {
		WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
	}

	public Ingredient(String id, String name, Type type) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}
	
	
}
