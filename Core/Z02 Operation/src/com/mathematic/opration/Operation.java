package com.mathematic.opration;

import java.util.Scanner;

public class Operation {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		try {
			while (true) {
				System.out.println("please enter 1st  number ::");
				int first = sc.nextInt();

				/*System.out.println("please Select Operation you want to perform ::");
				System.out.println("1. Add");
				System.out.println("2. Sub");
				System.out.println("3. Mul");
				System.out.println("4. Div");
				System.out.println("5. Module");
				System.out.println("6. Power");*/
				System.out.println("please Enter Operation you want to perform ::");
				String operation = sc.next();

				System.out.println("please enter 2st  number ::");
				int second = sc.nextInt();

				switch (operation) {
				case "+":
					System.out.println("Addition is " + (first + second));
					break;
				case "-":
					System.out.println("Substraction is " + (first - second));
					break;
				case "*":
					System.out.println("Multiplication is " + (first * second));
					break;
				case "/":
					System.out.println("Division is " + (first / second));
					break;
				case "%":
					System.out.println("Remender is " + (first % second));
					break;
				case "^":
					System.out.println("power is " + Math.pow(first, second));
					break;

				}
				continue;

			}

		} catch (Exception e) {
			System.out.println("Exception occurs");
		}

	}

}
