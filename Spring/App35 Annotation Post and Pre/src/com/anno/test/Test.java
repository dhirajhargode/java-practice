package com.anno.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.anno.beans.Car;

public class Test {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext("com/anno/cfg/application-Context.xml");
		Car c = ctx.getBean("car", Car.class);
		System.out.println(c);
		ctx.registerShutdownHook();

	}

}
