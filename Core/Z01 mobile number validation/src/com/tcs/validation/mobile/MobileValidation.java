package com.tcs.validation.mobile;

import java.util.Scanner;

public class MobileValidation {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			System.out.println("Enter Mobile Number :: ");
			try {

				long mobile = Long.parseLong(sc.nextLine()); // string

				if (Long.toString(mobile).length() < 10) {
					System.out.println("You enter no is below 10 digit Please enter only 10 digit number");
				} else if (Long.toString(mobile).length() > 10) {
					System.out.println("You enter no is above 10 digit Please enter only 10 digit number");
				} else {
					System.out.println("Please re enter your number");
					long remobile = Long.parseLong(sc.nextLine());

					if (Long.toString(mobile).length() < 10) {
						System.out.println("You enter no is below 10 digit Please enter only 10 digit number");
					} else if (Long.toString(mobile).length() > 10) {
						System.out.println("You enter no is above 10 digit Please enter only 10 digit number");
					} else {
						if (mobile == remobile) {
							System.out.println("Mobile number is valid");
							System.out.println("Thank you");
							break;
						} else {
							System.out.println("Your number is not valid please check again");
						}

					}
				}
			} // try
			catch (NumberFormatException nfe) {
				System.out.println("please enter number only");

			} // catch
		} // while

	}

}
