package com.spapps.payment.beans;

public class DebitCardPaymentImpl implements IPayment {

	public DebitCardPaymentImpl() {
		System.out.println("Debit Card : 0-param Const");
	}

	@Override
	public boolean pay(double amount, int pin) {
		System.out.println("Connecting to Paypal....");
		return true;
	}
}
