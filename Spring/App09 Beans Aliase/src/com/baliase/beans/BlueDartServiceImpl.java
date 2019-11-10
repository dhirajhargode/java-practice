package com.baliase.beans;

public class BlueDartServiceImpl implements IDelivery{
	
	@Override
	public void delivery(OrderInfo oInfo, PersonInfo pInf, ShippingInfo sInfo) {

		System.out.println("Delivery order by BLUE DART:: "+oInfo.getOrderNo());
		
		System.out.println("Thank you...");
	}
	
	
	
}
