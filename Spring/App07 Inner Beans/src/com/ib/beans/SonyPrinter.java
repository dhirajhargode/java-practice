package com.ib.beans;

import org.apache.commons.logging.impl.AvalonLogger;

public class SonyPrinter implements IPrinter{
	
	
	
	@Override
	public void print(double amt,double available) {
		System.out.println("Withdraw Amount :: " +amt);
		System.out.println("Available fund :: "+available);
		System.out.println("transaction sucesfull...!!");
	}

	@Override
	public void print(String msg, double available) {
		System.out.println("******Insufficient Fund*******");
		System.out.println("Please enter Amount less than ::"+available);
			
	}

}
