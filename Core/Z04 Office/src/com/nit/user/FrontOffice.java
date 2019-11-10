package com.nit.user;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.nit.beans.Employee;
import com.nit.blogic.Company;

public class FrontOffice {

	static Company company = Company.getCompany();
	static Scanner sc = new Scanner(System.in);
	private static int eid ;
	private static double sal,isal;
	private static String name, dept; 

	public static void main(String[] args) {

		while (true) {
			System.out.println("Enter Company ID ::");
			String eid = sc.next();

			if (company.loginValidate(eid)) {
				System.out.println("Permision is granted");
				break;
			} else {
				System.out.println("permision is not granted");
			}
		} // while

		while (true) {
			System.out.println("Select any one Option.");
			System.out.println("1. Add Employee");
			System.out.println("2. Display Employee List");
			System.out.println("3. Update Salary");
			System.out.println("4. Remove employee");
			System.out.println("5. Exit");
			int i = sc.nextInt();

			Employee e = new Employee();
			switch (i) {

			case 1:
				while (true) {
					
					try {
						System.out.println("Enter Employee ID");
						eid = sc.nextInt();
						e.setEno(eid);

						System.out.println("Enter Employee Name");
						 name = sc.next();
						e.setEname(name);

						System.out.println("Enter Employee Salary");
						sal = sc.nextDouble();
						e.setSal(sal);

						System.out.println("Enter Employee Department");
						dept = sc.next();
						e.setDept(dept);
						company.registerd(e);

					} catch (java.util.InputMismatchException ime) {
						System.out.println("Input Mismatched ");
					} catch (NumberFormatException nfe) {
						System.out.println("Number Formate Exception");
					}

					break;
				}

			case 2:

				company.display();
				break;

			case 3:
				while (true) {
					System.out.println("Enter your Employee ID ");
					eid=sc.nextInt();
					System.out.println("Increment Salary  is");
					isal=sc.nextDouble();
					e.setSal(isal);
					
					company.registerd(e);
					break;
				}
			case 4:
				break;

			case 5:
				break;

			}// switch

		} // while

	}// main

}// class
