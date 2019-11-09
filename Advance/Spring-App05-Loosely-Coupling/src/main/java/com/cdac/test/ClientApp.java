package com.cdac.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.beans.Flipkart;

public class ClientApp {
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("cfg.xml");
		Flipkart f = (Flipkart) ctx.getBean("flipkart");
		String order = f.purchase("shirt", "mobile");
		System.out.println(order);
	}

}
