package com.ucll;

import java.util.ArrayList;
import java.util.List;

public class Composite {

	private List<Review> review= new ArrayList<Review>();
	private Destination destination;
	private WeatherInfo weather;
	private String message;

	public Composite() {
		
		this.message = "Services: ";
	}

	
	
	
	
	
	

	public List<Review> getReview() {
		return review;
	}

	public void setReview(List<Review> review) {
		this.message += " , Review";
		this.review = review;
	}

	public Destination getDestination() {
		return destination;
	}

	public void setDestination(Destination destination) {
		this.message += " , Destination";
		this.destination = destination;
	}

	public WeatherInfo getWeather() {
		return weather;
	}

	public void setWeather(WeatherInfo weather) {
		this.message += " , Weather";
		this.weather = weather;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	

	
	
	
}
