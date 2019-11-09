package com.cdac.beans;

import java.util.Random;

public class Flipkart {

	private Courier c;

	public Flipkart() {
	}

	/**
	 * @param c
	 */
	public Flipkart(Courier c) {
		this.c = c;
	}

	public Courier getC() {
		return c;
	}

	public void setC(Courier c) {
		this.c = c;
	}

	public String purchase(String...item) {
		Random r = new Random();
		int id = r.nextInt(1000);

		String status = c.deliver(id);
		return status;
	}
}
