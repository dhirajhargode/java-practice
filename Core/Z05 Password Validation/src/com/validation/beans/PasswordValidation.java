package com.validation.beans;

public class PasswordValidation {

	private String psw;
	private int len = 0;
	private int cond1 = 0, cond2 = 0, cond3 = 0;
	private String number = "0123456789";
	private String symbol = "!@#$%&*";

	public void validate(String psw) {

		len = psw.length();
		String st[] = psw.split("");

		if (!psw.isEmpty()) {
			// check length b/w 8 to 17
			if (psw.length() >= 8 && psw.length() <= 17) {

				for (int i = 0; i < len; i++) {
					// checking for uppercase
					if (st[i] == st[i].toUpperCase()) {
						cond1 = 1;
					}
					// checking for special char
					if (symbol.indexOf(st[i]) != -1) {
						cond2 = 1;
					}
					// checking for number
					if (number.contains(st[i])) {
						cond3 = 1;
					}
				}
			}
		} else {
			System.out.println("Password should not empty..");
		}

		if (cond1 == 1 && cond2 == 1 && cond3 == 1) {
			System.out.println("The entered password is valid to take");
		} else {
			System.out.println("Invalid password ..... ");
		}
	}
}// class
