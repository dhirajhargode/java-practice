package com.balias.beans;

public class BlueDartDeliveryServiceImpl implements IDelivery {

	@Override
	public void deliverProduct(OrderInfo oInfo, PersonInfo pInfo, ShippingAddress sAddr) {
		System.out.println("Delivery hand over to BLUE DART..");
		System.out.println("Order Delivered : " + oInfo.getOrderId());
	}
}
