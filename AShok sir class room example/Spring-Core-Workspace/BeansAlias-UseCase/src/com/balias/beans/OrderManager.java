package com.balias.beans;

public class OrderManager {

	private IDelivery blueDartDelivery, dtdcDelivery;
	private PersonInfo person;
	private OrderInfo order;
	private ShippingAddress addr;

	public void processOrder() {
		boolean isPaymentSuccs = processPayment(order.getOrderPrice());
		if (isPaymentSuccs) {
			if (addr.getZipcode() >= 5000) {
				// Deliver through blue dart
				blueDartDelivery.deliverProduct(order, person, addr);
			} else {
				// Deliver through DTDC
				dtdcDelivery.deliverProduct(order, person, addr);
			}
		}

	}

	public boolean processPayment(double amount) {
		System.out.println("Connecting to Paypal....");
		return true;
	}

	public IDelivery getBlueDartDelivery() {
		return blueDartDelivery;
	}

	public void setBlueDartDelivery(IDelivery blueDartDelivery) {
		this.blueDartDelivery = blueDartDelivery;
	}

	public IDelivery getDtdcDelivery() {
		return dtdcDelivery;
	}

	public void setDtdcDelivery(IDelivery dtdcDelivery) {
		this.dtdcDelivery = dtdcDelivery;
	}

	public PersonInfo getPerson() {
		return person;
	}

	public void setPerson(PersonInfo person) {
		this.person = person;
	}

	public OrderInfo getOrder() {
		return order;
	}

	public void setOrder(OrderInfo order) {
		this.order = order;
	}

	public ShippingAddress getAddr() {
		return addr;
	}

	public void setAddr(ShippingAddress addr) {
		this.addr = addr;
	}

}
