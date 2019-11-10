package com.nit.flipkart.beans;

import java.util.Random;

public class Filpkart {

	Courier courier;
	int orderid;

	public void setCourier(Courier courier) {
		System.out.println("Flipkart set courier");
		this.courier = courier;
	}

	public String purchase(String items[]) {
		Random rad = new Random();   // generate random number
		int orderid = rad.nextInt();

		String status = courier.delivery(orderid);
		return status +" \n Bill amount of order id "+orderid+ "\n Bill AMount :: Rs.....";
	}

}
