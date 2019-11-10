package com.nt.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.InterestCal;

public class test {
	private static ApplicationContext cxt;

	public static void main(String[] args) {
		cxt = new ClassPathXmlApplicationContext("com/nt/xml/application-Context.xml");
		InterestCal cal = cxt.getBean("int", InterestCal.class);
		System.out.println(cal.cal("ibm", 1000, 12));
		
		
	}
}
