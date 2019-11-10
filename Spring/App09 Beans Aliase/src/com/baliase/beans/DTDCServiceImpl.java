package com.baliase.beans;

public class DTDCServiceImpl implements IDelivery {

	@Override
	public void delivery(OrderInfo oInfo, PersonInfo pInf, ShippingInfo sInfo) {

		System.out.println("Delivery order by DTDC:: " + oInfo.getOrderNo());
		System.out.println("Thank you...");
	}

}
