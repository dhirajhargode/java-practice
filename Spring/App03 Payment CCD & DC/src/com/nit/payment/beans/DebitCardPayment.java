package com.nit.payment.beans;

public class DebitCardPayment implements IPayment {
	public DebitCardPayment() {
		System.out.println("DebitCardPAyment :0-param const");
	}
	@Override
	public boolean pay(double amt, int pin) {
		System.out.println("Processing for payPal.....");
		return true;
	}
	

}
