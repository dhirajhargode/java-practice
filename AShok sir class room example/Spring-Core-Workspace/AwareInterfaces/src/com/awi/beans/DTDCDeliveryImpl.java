package com.awi.beans;

public class DTDCDeliveryImpl implements IDeliverService {
	@Override
	public void deliver(int zipCode) {
		System.out.println("Delivered through DTDC");
	}
}
