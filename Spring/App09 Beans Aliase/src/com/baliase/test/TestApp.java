package com.baliase.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.baliase.beans.OrderInfo;
import com.baliase.beans.OrderManger;
import com.baliase.beans.PersonInfo;
import com.baliase.beans.ShippingInfo;

public class TestApp {

	public static void main(String[] args) {
		ClassPathResource res = new ClassPathResource("com/baliase/cfg/application-Context.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		OrderManger om = factory.getBean("orderManager", OrderManger.class);
		om.processOrder();
	}
}
