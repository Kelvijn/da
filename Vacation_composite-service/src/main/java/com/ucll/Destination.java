package com.ucll;

public class Destination {

	private long id = -99;
	private String name, country, postcode;
	
	public Destination() {
		
	}

	public Destination(long id, String name, String country, String postcode) {
		super();
		this.id = id;
		this.name = name;
		this.country = country;
		this.postcode = postcode;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	
}
