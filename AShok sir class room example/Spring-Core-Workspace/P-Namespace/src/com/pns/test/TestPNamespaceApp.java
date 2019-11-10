package com.pns.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.pns.beans.Car;

public class TestPNamespaceApp {

	public static void main(String[] args) {

		Resource res = new ClassPathResource("com/pns/cfg/application-Context.xml");
		BeanFactory factory = new XmlBeanFactory(res);

		Car c = factory.getBean("car", Car.class);
		System.out.println(c);
	}
}
