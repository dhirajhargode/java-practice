package com.nit.wish;

import java.util.Date;

public class WishGenerator {

	public String name;
	public Date date;

	public WishGenerator(String name, Date date) {
		System.out.println("Wish Generator Comstructor");

		this.name = name;
		this.date = date;
	}

	public String generateMsg() {
		System.out.println("generate msg method..");
		return "Good Afternoon " + name +" "+ date;
	}

}
