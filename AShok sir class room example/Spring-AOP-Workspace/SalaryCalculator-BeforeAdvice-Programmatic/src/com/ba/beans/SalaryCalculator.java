package com.ba.beans;

public class SalaryCalculator {

	public void computeSalary(double basicPay, String empId) {
		double da = basicPay * 20 / 100;
		double hra = basicPay * 15 / 100;
		double gross = basicPay + da + hra;
		double incomTax = gross * 10 / 100;
		double pf = basicPay * 12 / 100;
		double deductions = pf + incomTax;
		double net = gross - deductions;
		System.out.println("Salary Computation for Emp Id : " + empId);
		System.out.println("Net Salary : " + net);
	}
}
