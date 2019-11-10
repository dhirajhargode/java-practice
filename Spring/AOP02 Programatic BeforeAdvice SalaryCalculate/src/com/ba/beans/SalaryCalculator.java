package com.ba.beans;

public class SalaryCalculator {

	public void computeSalary(double bp, String empId) {

		double hra = bp * 20 / 100;
		double da = bp * 15 / 100;
		double pf = bp * 12 / 100;

		double gross = (bp + hra + da);
		double incomtax;
		if (bp > 500000) {
			incomtax = bp * 20 / 100;
		} else {
			incomtax = bp * 10 / 100;
		}
		double ded = incomtax + pf;
		double net = gross - ded;
		System.out.println("Gross Salary ::" + gross);
		System.out.println("Net Salary ::" + net);

	}

}
