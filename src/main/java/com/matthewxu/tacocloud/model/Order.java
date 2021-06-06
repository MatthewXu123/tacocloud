
package com.matthewxu.tacocloud.model;

import java.util.Date;

import javax.validation.constraints.NotBlank;

/**
 * Description:
 * @author Matthew Xu
 * @date Apr 13, 2021
 */
public class Order {

	private long id;
	
	private Date placedAt;
	
	@NotBlank(message = "Name is required.")
	private String name;
	
	private String street;
	
	private String city;
	
	private String state;
	
	private String zip;
	
	@NotBlank(message = "ccNumber is required.")
	private String ccNumber;
	
	private String ccExpiration;
	
	private String ccCVV;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCcNumber() {
		return ccNumber;
	}

	public void setCcNumber(String ccNumber) {
		this.ccNumber = ccNumber;
	}

	public String getCcExpiration() {
		return ccExpiration;
	}

	public void setCcExpiration(String ccExpiration) {
		this.ccExpiration = ccExpiration;
	}

	public String getCcCVV() {
		return ccCVV;
	}

	public void setCcCVV(String ccCVV) {
		this.ccCVV = ccCVV;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getPlacedAt() {
		return placedAt;
	}

	public void setPlacedAt(Date placedAt) {
		this.placedAt = placedAt;
	}
	
}
