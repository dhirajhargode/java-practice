package com.ci.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ci.beans.Person;

public class TestApp {

	public static void main(String[] args) {

		ClassPathResource res = new ClassPathResource("com/ci/cfg/application-Context.xml");
		BeanFactory factory = new XmlBeanFactory(res);

		Person p = factory.getBean("person", Person.class);
		System.out.println(p);

	}

}
