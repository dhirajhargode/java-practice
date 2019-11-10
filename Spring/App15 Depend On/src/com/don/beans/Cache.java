package com.don.beans;

import java.util.HashMap;
import java.util.Map;

public class Cache {
	
	private Map<String,Object> dataMap =new HashMap();
	
	
	public void put(String key,Object val) {
		dataMap.put(key, val);
	}
	
	public Object get(String key) {

		return dataMap.get(key);
	}
	
	public boolean constrainKey(String key) {
		return constrainKey(key);
	}
	
	
	

}
