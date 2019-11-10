package com.ib.beans;

public class SonyPrinter implements IPrinter {

	public SonyPrinter() {
		System.out.println("SonyPrinter : Injected");
	}

	@Override
	public void print(double availableBal, double withdrawnAmt) {
		System.out.println("Amount with drawn succesfully : " + withdrawnAmt);
		System.out.println("Available Balance : " + availableBal);
		System.out.println("Thankyou...!!");

	}

	@Override
	public void print(String msg) {
		System.out.println(msg);
	}

}
