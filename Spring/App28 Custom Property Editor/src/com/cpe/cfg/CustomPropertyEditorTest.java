package com.cpe.cfg;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cpe.beans.Calculator;

public class CustomPropertyEditorTest {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("com/cpe/cfg/application-Context.xml");

		Calculator c = ctx.getBean("calculator", Calculator.class);
		c.add();

	}

}
