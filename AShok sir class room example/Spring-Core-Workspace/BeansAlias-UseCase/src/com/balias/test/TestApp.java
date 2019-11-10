package com.balias.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.balias.beans.OrderManager;

public class TestApp {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("com/balias/cfg/application-Context.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		OrderManager om = factory.getBean("orderManager", OrderManager.class);
		om.processOrder();
	}
}
