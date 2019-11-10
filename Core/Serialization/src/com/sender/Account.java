package com.sender;

import java.io.Serializable;

public class Account implements Serializable {

	public static final long serialVersionUID = 1L;
	
	private Integer accountNumber = 101;
	private String holderName = "Dhiraj";

	public Account() {
	}

	public Account(Integer accountNumber, String holderName) {
		this.accountNumber = accountNumber;
		this.holderName = holderName;
	}

	@Override
	public String toString() {
		return "" + accountNumber + " " + holderName;
	}

}
