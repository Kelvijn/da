package com.ucll;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CompositeRest {

	
	//@Autowired
	private  RestTemplate restTemplate;

	public CompositeRest(RestTemplateBuilder restTemplateBuilder) {
		this.restTemplate = restTemplateBuilder.build();
	}

	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public Composite findOne(@PathVariable("name") String name) {
		Composite result = new Composite();

		String WEATHER_URL = "http://localhost:8766/weather/" + name;
		String DESTINATION_URL = "http://localhost:8766/destinations/" + name;
		String REVIEW_URL = "http://localhost:8766/reviews/" + name;

		try {
			Destination destination = restTemplate.getForObject(DESTINATION_URL, Destination.class);
			

			result.setDestination(destination);

		} catch (Exception e) {
			// TODO: handle exception
		}
		try {
			Review[] review = restTemplate.getForObject(REVIEW_URL, Review[].class);
			result.setReview(new ArrayList<>(Arrays.asList(review)));

		} catch (Exception e) {
			// TODO: handle exception
		}

		try {
			WeatherInfo weather = restTemplate.getForObject(WEATHER_URL, WeatherInfo.class);
			result.setWeather(weather);

		}catch (Exception e) {
			// TODO: handle exception
		}
		return result;
	}
}
