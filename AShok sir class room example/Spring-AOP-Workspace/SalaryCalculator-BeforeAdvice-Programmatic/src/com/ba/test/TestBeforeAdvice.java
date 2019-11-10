package com.ba.test;

import org.springframework.aop.framework.ProxyFactory;

import com.ba.beans.LogAdvice;
import com.ba.beans.SalaryCalculator;

public class TestBeforeAdvice {

	public static void main(String[] args) {

		ProxyFactory factory = new ProxyFactory();
		factory.setTarget(new SalaryCalculator());
		factory.addAdvice(new LogAdvice());

		SalaryCalculator sc = (SalaryCalculator) factory.getProxy();

		sc.computeSalary(25000.00, "ORCL686");

	}

}
