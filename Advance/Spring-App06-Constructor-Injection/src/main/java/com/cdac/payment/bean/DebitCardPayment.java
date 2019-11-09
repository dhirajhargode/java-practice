package com.cdac.payment.bean;

public class DebitCardPayment implements IPayment{
	
	
	public DebitCardPayment() {
//		System.out.println("==>Debit Card Payment()");
	}

	public boolean pay(double amt, int pin) {
		boolean flag = false;

		if (pin == 4321)
			flag = true;
		System.out.println("Debit card payment connecting to paypal");
		return flag;
	}

}
