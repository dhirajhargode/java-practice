package com.awi.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.awi.beans.OrderManager;

public class TestAwareApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/awi/cfg/application-Context.xml");
		OrderManager om = context.getBean("om", OrderManager.class);
		om.deliverProduct(7000);
	}

}
