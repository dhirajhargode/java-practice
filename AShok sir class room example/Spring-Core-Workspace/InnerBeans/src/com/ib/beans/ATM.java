package com.ib.beans;

public class ATM {

	private double availableBal = 20000.00;

	private IPrinter printer;

	// To inject printer thorugh setter injection
	public void setPrinter(IPrinter printer) {
		this.printer = printer;
	}

	public void withdraw(double amount) {
		if (amount <= availableBal) {
			availableBal = availableBal - amount;
			printer.print(availableBal, amount);
		} else {
			printer.print("*****Insufficient Funds*****");
		}
	}
}
