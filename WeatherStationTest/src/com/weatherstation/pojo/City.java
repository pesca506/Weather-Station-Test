package com.weatherstation.pojo;

public class City {
	private String name;
	private String location;
	private String currentWeatherCondition;
	private String iconWeatherConditions;
	private String temperate;
	private String currentAtmosphericPressure;
	private String currentHumidity;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCurrentWeatherCondition() {
		return currentWeatherCondition;
	}
	public void setCurrentWeatherCondition(String currentWeatherCondition) {
		this.currentWeatherCondition = currentWeatherCondition;
	}
	public String getIconWeatherConditions() {
		return iconWeatherConditions;
	}
	public void setIconWeatherConditions(String iconWeatherConditions) {
		this.iconWeatherConditions = iconWeatherConditions;
	}
	public String getTemperate() {
		return temperate;
	}
	public void setTemperate(String temperate) {
		this.temperate = temperate;
	}
	public String getCurrentAtmosphericPressure() {
		return currentAtmosphericPressure;
	}
	public void setCurrentAtmosphericPressure(String currentAtmosphericPressure) {
		this.currentAtmosphericPressure = currentAtmosphericPressure;
	}
	public String getCurrentHumidity() {
		return currentHumidity;
	}
	public void setCurrentHumidity(String currentHumidity) {
		this.currentHumidity = currentHumidity;
	}
}
