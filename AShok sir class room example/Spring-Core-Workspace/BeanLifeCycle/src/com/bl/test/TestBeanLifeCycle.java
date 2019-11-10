package com.bl.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.bl.beans.Motor;
import com.bl.beans.Rocket;

public class TestBeanLifeCycle {

	public static void main(String[] args) {

		Resource resource = new ClassPathResource("com/bl/cfg/application-Context.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Motor m = factory.getBean("m", Motor.class);
		m.doWork();
		System.out.println("======================");

		Rocket r = factory.getBean("r", Rocket.class);
		r.doWork();

		ConfigurableListableBeanFactory cFactory = (ConfigurableListableBeanFactory) factory;

	}
}
