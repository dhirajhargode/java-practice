package com.nit.flipkart.beans;

public class BlueDraft implements Courier {
	@Override
	public String delivery(int orderid) {
		// TODO Auto-generated method stub
		return "BlueDraft is ready to deliver product od "+orderid;
	}

}
