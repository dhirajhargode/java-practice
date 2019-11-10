package com.aa.beans;

public class LoanCalculator {

	public double computeRi(double p, int t, double r) {
		System.out.println("ComputeRi Executed...");
		return (p * t * r) / 100;
	}
}
