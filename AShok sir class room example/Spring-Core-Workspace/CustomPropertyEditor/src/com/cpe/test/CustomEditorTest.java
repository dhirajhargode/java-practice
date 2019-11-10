package com.cpe.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cpe.beans.Calculator;

public class CustomEditorTest {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"com/cpe/cfg/application-Context.xml");
		Calculator c = context.getBean("calc", Calculator.class);
		c.add();
	}
}
