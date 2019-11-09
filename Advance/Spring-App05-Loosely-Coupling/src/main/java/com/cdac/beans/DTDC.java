package com.cdac.beans;

public class DTDC implements Courier {

	public DTDC() {
	}

	public String deliver(int orderid) {
		return "DTDC is ready to deliver your product with id :" + orderid;
	}

}
