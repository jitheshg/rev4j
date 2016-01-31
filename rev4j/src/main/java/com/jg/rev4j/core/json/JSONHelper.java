/**
 * 
 */
package com.jg.rev4j.core.json;

import com.google.gson.Gson;
import com.google.gson.JsonElement;

/**
 * 
 * @author Jithesh G
 *
 */
public class JSONHelper {

	private Gson gson;
	
	public JSONHelper () {
		this.gson = new Gson();
	}
	
	public String toJSON(Object value) {
		return this.gson.toJson(value);
	}
	
	public JsonElement toJSONTree(Object value) {
		return this.gson.toJsonTree(value);
	}
}
