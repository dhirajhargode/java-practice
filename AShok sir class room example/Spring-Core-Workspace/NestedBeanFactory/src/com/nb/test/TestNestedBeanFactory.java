package com.nb.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.nb.beans.Rocket;

public class TestNestedBeanFactory {

	public static void main(String[] args) {

		Resource parentResource = new ClassPathResource("com/nb/cfg/fuel-bean.xml");
		BeanFactory parentFactory = new XmlBeanFactory(parentResource);

		Resource childResource = new ClassPathResource("com/nb/cfg/rocket-bean.xml");
		BeanFactory childFactory = new XmlBeanFactory(childResource, parentFactory);

		Rocket rocket = childFactory.getBean("rocket", Rocket.class);
		System.out.println(rocket);
	}

}
