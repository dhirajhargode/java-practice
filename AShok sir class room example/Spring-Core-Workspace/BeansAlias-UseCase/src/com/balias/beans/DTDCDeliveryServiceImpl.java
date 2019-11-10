package com.balias.beans;

public class DTDCDeliveryServiceImpl implements IDelivery {

	@Override
	public void deliverProduct(OrderInfo oInfo, PersonInfo pInfo, ShippingAddress sAddr) {
		System.out.println("Delivery handover to DTDC..");
		System.out.println("Order Delivered : " + oInfo.getOrderId());

	}

}
