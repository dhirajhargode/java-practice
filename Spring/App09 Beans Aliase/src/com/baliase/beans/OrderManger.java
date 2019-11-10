package com.baliase.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class OrderManger {

	private IDelivery blueDartDelivey, dtdcDelivey;
	private PersonInfo person;
	private OrderInfo order;
	private ShippingInfo addr;

	private boolean paymentProcess(double amount) {
		System.out.println("Payment is in process Connecting to paypal....");
		return true;
	}

	public void processOrder() {
		//boolean ispaymentProcess=paymentProcess(order.getOrderPrice());
		if(paymentProcess(order.getOrderPrice())){
			if (addr.getZipcode() >= 5000) {
				// Deliver through blue dart
				blueDartDelivey.delivery(order, person, addr);
			} else {
				// Deliver through DTDC
				dtdcDelivey.delivery(order, person, addr);
			}
		}
	}

	public IDelivery getBlueDartDelivey() {
		return blueDartDelivey;
	}

	public void setBlueDartDelivey(IDelivery blueDartDelivey) {
		this.blueDartDelivey = blueDartDelivey;
	}

	public IDelivery getDtdcDelivey() {
		return dtdcDelivey;
	}

	public void setDtdcDelivey(IDelivery dtdcDelivey) {
		this.dtdcDelivey = dtdcDelivey;
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

	public ShippingInfo getAddr() {
		return addr;
	}

	public void setAddr(ShippingInfo addr) {
		this.addr = addr;
	}

}