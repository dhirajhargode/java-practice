package com.ara.test;

import org.springframework.aop.framework.ProxyFactory;

import com.ara.beans.Calculator;
import com.ara.beans.LogAdvice;

public class TestAfterReturning {
	public static void main(String[] args) {

		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(new Calculator());
		pf.addAdvice(new LogAdvice());

		Calculator c = (Calculator) pf.getProxy();
		System.out.println("Add is :: " + c.add(20, 10));
		System.out.println("sub is :: " + c.sub(20, 10));

	}

}
