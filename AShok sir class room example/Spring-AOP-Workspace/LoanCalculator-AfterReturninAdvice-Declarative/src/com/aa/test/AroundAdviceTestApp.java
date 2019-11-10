package com.aa.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aa.beans.LoanCalculator;

public class AroundAdviceTestApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/ba/cfg/application-Context.xml");
		LoanCalculator lc = (LoanCalculator) context.getBean("lcalc");

		double i = lc.computeRi(500000, 12, 2);
		System.out.println("Loan amount :" + i);

	}

}
