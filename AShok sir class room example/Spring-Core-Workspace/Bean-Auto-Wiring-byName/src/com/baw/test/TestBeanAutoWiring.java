package com.baw.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.baw.beans.Robot;

public class TestBeanAutoWiring {

	public static void main(String[] args) {

		Resource res = new ClassPathResource("com/baw/cfg/application-Context.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		Robot r = factory.getBean("robot", Robot.class);
		System.out.println(r);
	}

}
