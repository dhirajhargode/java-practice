package com.baw.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.baw.beans.Robot;

public class TestApp {
	public static void main(String[] args) {

		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/baw/cfg/application-Context.xml"));

		Robot r = (Robot) factory.getBean("robot");
		System.out.println(r);

	}

}
