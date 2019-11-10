package com.ta.beans;

public class NullPointerAspect {
	
	public void handle(NullPointerException npe) {
		System.out.println("from handle Method");
		//repeate print exception
		//npe.printStackTrace();
	}

}
