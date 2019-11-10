package com.bt.ad.beans;

public class BankTransaction {
	public void deposit(double amount, long accNo) {
		System.out.println("Amount credited...");
	}

	public void withdraw(double amount, long accno) {
		System.out.println("Amount debited...");
	}
}
