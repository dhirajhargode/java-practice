package com.don.beans;

import java.util.HashSet;

public class PersnalLoanEMICompute {

	private Cache cache;

	public Cache getCache() {
		return cache;
	}

	public void setCache(Cache cache) {
		this.cache = cache;
	}

	public void calculateEMI(String cn, double pAmt, int tim) {
		Object val = cache.get(cn);
		double riperyear = Double.parseDouble(val.toString());
		double ripermonth = riperyear / 12 / 100;

		double emiAmt = (pAmt * ripermonth) /( 1-Math.pow(1 + ripermonth, -tim));
		System.out.println("EMI amount :: " + emiAmt);
		double total = emiAmt * tim;
		System.out.println("Total amount :: " + total);
		System.out.println("Extra money :: " + (total - pAmt));

	}

}
