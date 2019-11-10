package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.OrderApprover;

public class Test {
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfg/application-Context.xml");
		OrderApprover op = ctx.getBean("pfb", OrderApprover.class);
		System.out.println("Order Approved ?" + op.apporoveOrder(12356));
		System.out.println("-------------------------------------");
		System.out.println("Order Approved ?" + op.apporoveOrder(-12356));
		System.out.println("-------------------------------------");
		System.out.println("Order Approved ?" + op.apporoveOrder(0));

	}

}
