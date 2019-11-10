package com.don.beans;

import java.util.ResourceBundle;
import java.util.Set;

public class CacheManager {

	private Cache cache;
	String fileName;

	public CacheManager(Cache cache, String fileName) {
		this.cache = cache;
		this.fileName = fileName;
		loadDataIntoCache();
	}

	public void loadDataIntoCache() {
		ResourceBundle rb = ResourceBundle.getBundle(fileName);
		Set<String> keys = rb.keySet();
		for (String key : keys) {
			Object value = rb.getObject(key);
			cache.put(key, value);
		}
		System.out.println(cache);
	}

}
