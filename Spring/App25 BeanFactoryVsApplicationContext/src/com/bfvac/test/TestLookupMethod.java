package com.bfvac.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.bfvac.beans.A;

public class TestLookupMethod {

	public static void main(String[] args) {

		// BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/bfvac/cfg/application-Context.xml"));
		// A a =factory.getBean("a",A.class);

		ApplicationContext context = new ClassPathXmlApplicationContext("com/bfvac/cfg/application-Context.xml");
	}

}
