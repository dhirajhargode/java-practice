package com.ifd.beans;

public class ATM {

	private Printer printer;

	public void setPrinter(Printer printer) {
		this.printer = printer;
	}

	@Override
	public String toString() {
		return "ATM [printer=" + printer + "]";
	}
	
	
}
