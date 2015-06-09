package com.weatherstation.controllers;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.weatherstation.pojo.City;
import com.weatherstation.util.json.UtilitiesJSON;
import com.weatherstation.constant.Constant;

@Controller
public class WeatherStationtRestController {

	@RequestMapping("/WeatherStationView")
	 public ModelAndView WeatherStationView() {
		ModelAndView ModelAndView = new ModelAndView("WeatherStationView");
		return ModelAndView;
	 }
	
	@ResponseBody
	@RequestMapping(value="/consultCityWeather" , method=RequestMethod.POST)
	public String consultCityWeather(City city) throws JsonParseException, JsonMappingException, IOException{
		return UtilitiesJSON.objectToJSON(new RestTemplate().getForObject(Constant.PATH_WEATHER_SERVICE+city.getName(), String.class));
	}
}