package com.nit.flipkart.beans;

public class DTDC implements Courier{
	
	@Override
	public String delivery(int orderid) {
		
		return "DTDC is ready to deliver product order "+orderid;
	}


}
