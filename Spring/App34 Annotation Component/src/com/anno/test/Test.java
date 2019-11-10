package com.anno.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.anno.beans.Car;
import com.anno.cfg.AppConfig;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		Car c = ctx.getBean(Car.class);
		System.out.println(c);

	}

}
