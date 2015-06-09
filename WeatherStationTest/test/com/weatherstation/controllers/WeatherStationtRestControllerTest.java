package com.weatherstation.controllers;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.junit.Before;
import org.junit.Test;

import com.weatherstation.pojo.City;

public class WeatherStationtRestControllerTest {
	private City city;
	
	@Before
    public void setUp() {
		city = new City();
		city.setName("London");
    }
	
	@Test
	public void consultCityWeatherTest() throws JsonParseException, JsonMappingException, IOException {
		assertTrue(new WeatherStationtRestController().consultCityWeather(city)!=null);
	}	
}
