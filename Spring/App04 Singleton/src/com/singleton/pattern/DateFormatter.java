package com.singleton.pattern;

import java.io.Serializable;

public class DateFormatter implements Cloneable,Serializable {

	private static DateFormatter instance = null;

	// Don't delete it
	private DateFormatter() {

	}

	
	public static DateFormatter getInstance() {
		if (instance == null) {
			synchronized (DateFormatter.class) {
				// Double-checking
				if (instance == null) {
					instance = new DateFormatter();
				}
			}
		}
		return instance;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {

		return instance;
		//return super.clone();
	}
	
	// deserialization 
	protected Object readResolve() {
		return instance;
	}
	

}
