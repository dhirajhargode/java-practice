package com.ba.test;

import org.springframework.aop.framework.ProxyFactory;

import com.ba.beans.LogAdvice;
import com.ba.beans.SalaryCalculator;

public class TestBeforeAdvice {
	
	public static void main(String[] args) {
		
		ProxyFactory pf=new ProxyFactory();
		pf.setTarget(new SalaryCalculator());
		pf.addAdvice(new LogAdvice());
		
		SalaryCalculator sc=(SalaryCalculator)pf.getProxy();
		sc.computeSalary(200000, "oracle5556");
		
	}

}
