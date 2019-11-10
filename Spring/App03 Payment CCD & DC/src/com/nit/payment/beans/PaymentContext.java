package com.nit.payment.beans;

import org.springframework.util.SocketUtils;

public class PaymentContext {
	IPayment payment;
	
	public PaymentContext() {
		System.out.println("Payment context 0: param const");
	}

	public PaymentContext(IPayment payment) {
		this.payment = payment;
		System.out.println("Payment context : 1-param const");
	}

	/*
	 * public void setPayment(IPayment payment) { this.payment = payment; }
	 */
	public boolean payBill(double amt, int pin) {
		
		boolean status = payment.pay(amt, pin);
		
		System.out.println("paymenet Status :: " + status);
		return true;
	}

}
