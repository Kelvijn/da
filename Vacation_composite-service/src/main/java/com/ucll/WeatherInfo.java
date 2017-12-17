package com.ucll;

public class WeatherInfo {

	private long id = -100;
	private String name, description, main = "";
	private double temp, tempMin, tempMax = -100;
	public WeatherInfo() {
		
	}
	
	public WeatherInfo(long id, String name, String description, String main, double temp, double tempMin,
			double tempMax) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.main = main;
		this.temp = temp;
		this.tempMin = tempMin;
		this.tempMax = tempMax;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getMain() {
		return main;
	}
	public void setMain(String main) {
		this.main = main;
	}
	public double getTemp() {
		return temp;
	}
	public void setTemp(double temp) {
		this.temp = temp;
	}
	public double getTempMin() {
		return tempMin;
	}
	public void setTempMin(double tempMin) {
		this.tempMin = tempMin;
	}
	public double getTempMax() {
		return tempMax;
	}
	public void setTempMax(double tempMax) {
		this.tempMax = tempMax;
	}
	
	
}
