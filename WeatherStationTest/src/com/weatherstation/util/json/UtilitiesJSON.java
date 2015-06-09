package com.weatherstation.util.json;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class UtilitiesJSON {

	public static String objectToJSON(Object object) throws JsonGenerationException, JsonMappingException, IOException {
		return new ObjectMapper().writeValueAsString(object);
	}
}
