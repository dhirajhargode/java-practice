package com.bt.ad.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bt.ad.beans.BankTransaction;

public class TestAroundAdvice {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/bt/ad/cfg/application-Context.xml");

		BankTransaction bt = context.getBean("bt", BankTransaction.class);

		bt.deposit(50000, 8686868);
		bt.withdraw(6700, 5757586);

	}

}
