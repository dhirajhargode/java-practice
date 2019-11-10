package com.spapps.payment.beans;

public class CrediCardPaymentImpl implements IPayment {

	public CrediCardPaymentImpl() {
		System.out.println("CCD Payment:0-param Const");
	}

	@Override
	public boolean pay(double amount, int pin) {
		System.out.println("Connecting to Paypal....");
		return true;
	}

}
