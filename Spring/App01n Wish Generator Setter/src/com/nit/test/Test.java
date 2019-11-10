package com.nit.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nit.wish.WishGenerator;

public class Test {

	public static void main(String[] args) {
		System.out.println("testClass...");

		ClassPathResource res = new ClassPathResource("application-context.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		WishGenerator wg = factory.getBean("wsg", WishGenerator.class);
		String result = wg.generateWishMsg();
		System.out.println(result);
	}
}
