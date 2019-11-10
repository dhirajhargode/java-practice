package com.ib.beans;

public class ATM {

	private IPrinter printer;
	private double availabeBal = 20000.00;

	public void setPrinter(IPrinter printer) {
		this.printer = printer;
	}

	public void withdraw(double amt) {
		if (availabeBal >= amt) {
			availabeBal = availabeBal - amt;
			printer.print(amt, availabeBal);
		} else {
			printer.print("Enter Valid Amount",availabeBal);
		}
	}

	@Override
	public String toString() {
		return "ATM [ printer=" + printer + ", availabeBal=" + availabeBal + "]";
	}

	

	
}
