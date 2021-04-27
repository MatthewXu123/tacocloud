
package com.matthewxu.tacocloud.model;

/**
 * Description:
 * @author Matthew Xu
 * @date Apr 13, 2021
 */
public class Order {

	private String name;
	
	private String street;
	
	private String city;
	
	private String state;
	
	private String zip;
	
	private String ccNumber;
	
	private String ccException;
	
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

	public String getCcException() {
		return ccException;
	}

	public void setCcException(String ccException) {
		this.ccException = ccException;
	}

	public String getCcCVV() {
		return ccCVV;
	}

	public void setCcCVV(String ccCVV) {
		this.ccCVV = ccCVV;
	}
	
	
}
