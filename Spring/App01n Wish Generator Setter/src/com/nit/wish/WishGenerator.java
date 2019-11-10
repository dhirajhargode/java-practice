package com.nit.wish;

import java.util.Date;

public class WishGenerator {

	private String name;
	private Date date;

	public WishGenerator() {
		System.out.println("Wish generator 0 parm constr");

	}

	public void setName(String name) {
		System.out.println("wishGenerator setName(-)");
		this.name = name;
	}

	public void setDate(Date date) {
		System.out.println("wishGenerator setDate(-)");
		this.date = date;
	}
	
	public String generateWishMsg()
	{
		System.out.println("generate msg method..");
		return "Good Morning...::"+name+"---->"+date;
	}
}
