package com.aa.beans;

public class BankTransaction {
	
	public void deposit(double amt, long acno) {
		System.out.println(amt +" amount credited");
	}
	public void withdral(double amt, long acno) {
		System.out.println(amt+" amount debited");
	}

}
