package com.cyclic.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.cyclic.beans.Car;

public class Test {
	public static void main(String[] args) {

		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("application-Context.xml"));
		Car c = factory.getBean("car", Car.class);
		c.getClass().getName();
		System.out.println(c);
	}

}
