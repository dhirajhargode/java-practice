package com.don.beans;

public class PersonalLoanEmiCalculator {

	private Cache cache;

	public void computeEmi(String cn, double pAmt, int tnm) {

		Object riPerYear = cache.get(cn);
		double riInDouble = Double.parseDouble(riPerYear.toString());
		double r = riInDouble / 12 / 100;

		double emiAmt = pAmt * r / (1 - Math.pow(1 + r, -tnm));
		System.out.println("Emi Amount : " + emiAmt);
		double totalAmt = emiAmt * tnm;
		System.out.println("Total Payable Amt : " + totalAmt);
		System.out.println("Extra Amount  : " + (totalAmt - pAmt));

	}

	public void setCache(Cache cache) {
		this.cache = cache;
	}

}
