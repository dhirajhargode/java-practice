package com.nit.flipkart.beans;

public class FirstFight implements Courier {
	@Override
	public String delivery(int orderid) {
		// TODO Auto-generated method stub
		return "FirstFight is ready to deliver product od "+orderid;
	}

}
