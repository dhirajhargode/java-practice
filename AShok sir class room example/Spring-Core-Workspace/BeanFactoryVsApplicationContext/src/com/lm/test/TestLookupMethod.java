package com.lm.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLookupMethod {

	public static void main(String[] args) {

		ApplicationContext context = 
		new ClassPathXmlApplicationContext("com/lm/cfg/application-context.xml");

		context.getBean("r");
		
	}
}
