package com.ba.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ba.beans.Calculator;

public class TestCalculator {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/ba/cfg/application-Context.xml");
		Calculator c = context.getBean("calc", Calculator.class);
		System.out.println("Sum : " + c.add(10, 20));
	}

}
