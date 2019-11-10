package com.nit.beans;

import java.util.Date;

public class WishGenerator {
	private String name;
	private Date date;

	public WishGenerator() {
		System.out.println("Wish Generator: 0 param constructor");
	}

	public void setName(String name) {
		System.out.println("Wish Generator: SetName(-)");
		this.name = name;
	}

	public void setDate(Date date) {
		System.out.println("Wish Generator: setDate(-)");
		this.date = date;
	}

	public String generateWishMsg() {
		return "Good morning :" + name + "--->" + date;
	}

}
