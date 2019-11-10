package com.ba.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ba.beans.Calculator;

public class Test {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/ba/cfg/application-Context.xml");

		Calculator c = context.getBean("cal", Calculator.class);
		System.out.println("Addition is ::" + c.add(10, 20));
	}

}
