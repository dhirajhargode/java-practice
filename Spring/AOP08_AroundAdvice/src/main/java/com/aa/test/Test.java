package com.aa.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aa.beans.BankTransaction;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/aa/cfg/Application-Context.xml");
		BankTransaction bt = ctx.getBean("bt",BankTransaction.class);
		bt.deposit(20000.000, 555645658);
		bt.withdral(1000.00, 555121236);
		
	}

}
