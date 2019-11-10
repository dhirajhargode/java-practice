package com.dc.model;

import com.dc.mapper.BookMapper;

public class Book {

	private int bid;
	private String aname;
	private String bname;
	private double price;
	private String isbn;
	
	private BookMapper bm; 

	public void setBid(int bid) {
		this.bid = bid;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	
	
	
	public BookMapper getBm() {
		return bm;
	}

	public void setBm(BookMapper bm) {
		this.bm = bm;
	}

	@Override
	public String toString() {
		return "\nBook [bid=" + bid + ", aname=" + aname + ", bname=" + bname + ", price=" + price + ", isbn=" + isbn
				+ "]";
	}

}
