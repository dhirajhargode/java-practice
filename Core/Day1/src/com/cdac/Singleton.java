package com.cdac;

public class Singleton implements Cloneable{

	private static Singleton instance = null;

	private Singleton() {
	}

	public static Singleton getInstance() {

		if (instance == null)
			instance = new Singleton();
		return instance;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
