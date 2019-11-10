package com.sdp.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.dhiraj.spring.Car;

public class TestApp {

	public static void main(String[] args) {

		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/sdp/cfg/application-Context.xml"));
		Car c = factory.getBean("car", Car.class);
		c.Vehicle();
	}
}
