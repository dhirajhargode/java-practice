package com.aa.test;

import org.springframework.aop.framework.ProxyFactory;

import com.aa.beans.LoanCalculator;
import com.aa.beans.LogAfterAdvice;

public class AroundAdviceTestApp {

	public static void main(String[] args) {
		ProxyFactory pf = new ProxyFactory();

		pf.setTarget(new LoanCalculator());
		pf.addAdvice(new LogAfterAdvice());

		LoanCalculator lc = (LoanCalculator) pf.getProxy();

		double i = lc.computeRi(500000, 12, 2);
		System.out.println("Loan amount :" + i);

	}

}
