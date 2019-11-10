package com.bg.ar.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bg.ar.beans.BillGenerator;

public class TestBillGenerationApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/bg/ar/cfg/application-Context.xml");
		BillGenerator bg = context.getBean("bg", BillGenerator.class);
		double billAmt = bg.generateBill(8989797);
		System.out.println("Bill amount : " + billAmt);
	}

}
