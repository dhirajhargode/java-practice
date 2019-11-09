package com.cdac.payment.bean;

public class CreditCardPayment implements IPayment {

	public CreditCardPayment() {
	//	System.out.println("==>Credit card payment()");
	}

	public boolean pay(double amt, int pin) {
		boolean flag = false;

		if (pin == 4321)
			flag = true;
		System.out.println("Credit card payment connecting to paypal ");
		return flag;
	}

}
