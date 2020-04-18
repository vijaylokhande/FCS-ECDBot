package com.fcs.ecdb.util;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fcs.ecdb.entity.DataDTO;

public class JSONToObj {

	public DataDTO convert(String json) {

		DataDTO dataDTO = null;

		ObjectMapper mapper = new ObjectMapper();
		try {
			dataDTO = mapper.readValue(json, DataDTO.class);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return dataDTO;
	}
}
