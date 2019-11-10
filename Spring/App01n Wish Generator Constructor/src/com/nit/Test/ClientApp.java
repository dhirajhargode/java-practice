package com.nit.Test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nit.wish.WishGenerator;

public class ClientApp {

	public static void main(String[] args) {
		System.out.println("Client App");
		ClassPathResource res = new ClassPathResource("application-Context.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		WishGenerator wg = factory.getBean("wsg", WishGenerator.class);
		String result = wg.generateMsg();
		System.out.println(result);
	}
}
