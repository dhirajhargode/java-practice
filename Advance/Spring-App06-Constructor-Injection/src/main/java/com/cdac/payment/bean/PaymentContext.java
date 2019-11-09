package com.cdac.payment.bean;

public class PaymentContext {

	private IPayment ipay;

	public PaymentContext() {
		System.out.println("==>PaymentContext()");
	}

	/**
	 * @param ipay
	 */
	public PaymentContext(IPayment ipay) {
		this.ipay = ipay;
	}

	public String payBill(double amount, int pin) {

		Boolean flag = ipay.pay(amount, pin);

		if (flag)
			return "Payment sucessfull";
		else
			return "Payment failed";

	}

}
