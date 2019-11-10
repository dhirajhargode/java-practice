package com.cda.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.cda.beans.A;

public class TestApp {

	public static void main(String[] args) {

		ClassPathResource res = new ClassPathResource("com/cda/cfg/application-Context.xml");
		BeanFactory factory = new XmlBeanFactory(res);

		A a = factory.getBean("a", A.class);
		System.out.println(a);
	}

}
