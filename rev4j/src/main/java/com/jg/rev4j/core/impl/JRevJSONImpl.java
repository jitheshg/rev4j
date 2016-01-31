package com.jg.rev4j.core.impl;

import java.util.Map.Entry;
import java.util.Iterator;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.jg.rev4j.core.JRev;
import com.jg.rev4j.core.json.JSONHelper;

/**
 * 
 * @author Jithesh G
 *
 */
public class JRevJSONImpl implements JRev {
	
	private static Logger log = LoggerFactory.getLogger(JRevJSONImpl.class);
	
	JSONHelper jsonHelper;
	
	public JRevJSONImpl(JSONHelper jsonHelper) {
		this.jsonHelper = jsonHelper;
	}

	public void compare(Object oldVersion, Object newVersion) {
		JsonElement vOld = this.jsonHelper.toJSONTree(oldVersion);
		JsonElement vNew = this.jsonHelper.toJSONTree(newVersion);
		if (vOld.isJsonObject() && vNew.isJsonObject()) {
			compareJSON(vOld, vNew);
		}
	}

	private void compareJSON(JsonElement vOld, JsonElement vNew) {
		JsonObject vOldObject = vOld.getAsJsonObject();
		JsonObject vNewObject = vNew.getAsJsonObject();
		Iterator<Entry<String, JsonElement>> iOld = vOldObject.entrySet().iterator();
		Set<Entry<String, JsonElement>> sNew = vNewObject.entrySet();
		while (iOld.hasNext()) {
			Entry<String, JsonElement> eOld = iOld.next();
			Entry<String, JsonElement> eNew = null;
		}
	}
}
