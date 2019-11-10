package com.aa.test;

import org.springframework.aop.framework.ProxyFactory;

import com.aa.beans.CacheAdvice;
import com.aa.beans.LoanCalculator;
import com.aa.beans.LogAdvice;
import com.aa.beans.PerformanceMonitoring;

public class AroundAdviceTest {
	public static void main(String[] args) {

		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(new LoanCalculator());
		pf.addAdvice(new PerformanceMonitoring());
		pf.addAdvice(new LogAdvice());
		pf.addAdvice(new CacheAdvice());

		LoanCalculator lc = (LoanCalculator) pf.getProxy();
		double i = lc.computeRi(500000, 12, 2);
		System.out.println("Rate of Interest is " + i);

		double i1 = lc.computeRi(500000, 12, 2);
		System.out.println("Rate of Interest is " + i1);

	}

}
