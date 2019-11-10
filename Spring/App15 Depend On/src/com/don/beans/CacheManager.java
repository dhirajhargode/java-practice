package com.don.beans;

import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Set;

public class CacheManager {

	private Cache cache;
	private String fileName;

	public CacheManager(Cache cache, String fileName) throws MissingResourceException{
		this.cache = cache;
		this.fileName = fileName;
		loanData();
	}

	public void setCache(Cache cache) {
		this.cache = cache;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Cache getCache() {
		return cache;
	}

	public String getFileName() {
		return fileName;
	}

	private void loanData() {
		ResourceBundle rb = ResourceBundle.getBundle(fileName);
		Set<String> keys = rb.keySet();

		for (String key : keys) {
			Object val = rb.getObject(key);
			cache.put(key, val);

		}
	}

}
