package com.bi.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.bi.beans.Mobile;

public class TestApp {

	public static void main(String[] args) {
		ClassPathResource res = new ClassPathResource("com/bi/cfg/application-Context.xml");
		BeanFactory factory = new XmlBeanFactory(res);

		Mobile m = factory.getBean("baseMobile", Mobile.class);
		System.out.println(m);

		Mobile m1 = factory.getBean("m2", Mobile.class);
		System.out.println(m1);

		Mobile m2 = factory.getBean("m3", Mobile.class);
		System.out.println(m2);

	}

}
