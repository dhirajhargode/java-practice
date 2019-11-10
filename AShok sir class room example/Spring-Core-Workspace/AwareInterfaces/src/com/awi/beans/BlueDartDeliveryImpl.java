package com.awi.beans;

public class BlueDartDeliveryImpl implements IDeliverService {
	@Override
	public void deliver(int zipCode) {
		System.out.println("Delivered through Bluedart");
	}
}
