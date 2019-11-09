package com.cdac.beans;

public class BlueDrat implements Courier {

	public BlueDrat() {
	}

	public final String deliver(int orderid) {
		return "Blue dart is ready to deliver your product with id:" + orderid;
	}

}
