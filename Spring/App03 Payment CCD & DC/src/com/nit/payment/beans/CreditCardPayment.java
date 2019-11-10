package com.nit.payment.beans;

public class CreditCardPayment implements IPayment{
	public CreditCardPayment() {
		System.out.println("Credit card Payment: 0-param const");
	}
	@Override
	public boolean pay(double amt, int pin) {
		System.out.println("Processing for payPal.....");
		return true;
	}

}
