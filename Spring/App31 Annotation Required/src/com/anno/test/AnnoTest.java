package com.anno.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.anno.beans.Car;

public class AnnoTest {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx =new ClassPathXmlApplicationContext("com/anno/cfg/application-Context.xml");
		Car c = ctx.getBean("c",Car.class);
		System.out.println(c);
	}

}
