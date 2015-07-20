package com.edifixio.amine.utils;

import java.util.HashMap;

import com.edifixio.amine.config.beans.FacetingConfig;
import com.edifixio.amine.config.beans.RequestConfig;
import com.edifixio.amine.config.beans.ResponseConfig;
import com.google.gson.JsonObject;

public abstract class ConfigToJson {
	
	public static JsonObject ConfigtoJson(RequestConfig requestConfig,
			ResponseConfig responseConfig, HashMap<String, Boolean> facets){
		return null;
	}

}
