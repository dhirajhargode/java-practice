package com.tcs.validation.name;

import java.util.Scanner;

public class NameValidation {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		while (true) {

			System.out.println("Register your Name for link ");

			try {
				System.out.println("Enter your First name please ");
				String fname = sc.nextLine();
				if (fname.length() > 15) {
					System.out.println("please enter your first name only ");
				} else {

					System.out.println("Enter your Last name please ");
					String lname = sc.nextLine();
					if (lname.length() > 15) {
						System.out.println("please enter your last name only ");
					} else {

						System.out.println("please conform your name please");
						System.out.println(fname + " " + lname);
						System.out.println("1. Change");
						System.out.println("2. Conform");
						System.out.println("Enter above number.");
						Integer select = Integer.parseInt(sc.nextLine());

						switch (select) {
						case 1: {
							System.out.println("Enter your First name please ");
							fname = sc.nextLine();
							if (fname.length() > 15) {
								System.out.println("please enter your first name only ");
							} else {

								System.out.println("Enter your Last name please ");
								lname = sc.nextLine();
								if (lname.length() > 15) {
									System.out.println("please enter your last name only ");
								}

							}
						} // case 1

						case 2: {
							System.out.println("Thanks for registration");
							break;

						}

						}// switch

						break;
					}

				}

			} // try
			catch (Exception e) {
				System.out.println("Please Enter Character only");
			}

		} // while

	}// main

}// class
