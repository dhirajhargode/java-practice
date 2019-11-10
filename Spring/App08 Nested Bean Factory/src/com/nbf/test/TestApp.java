package com.nbf.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nbs.beans.Fuel;
import com.nbs.beans.Rocket;

public class TestApp {
	public static void main(String[] args) {

		ClassPathResource res = new ClassPathResource("com/nbf/cfg/fuel-bean.xml");
		BeanFactory factory1 = new XmlBeanFactory(res);
		Fuel f = factory1.getBean("fuel", Fuel.class);
		System.out.println(f);

		ClassPathResource res1 = new ClassPathResource("com/nbf/cfg/rocket-bean.xml");
		BeanFactory factory2 = new XmlBeanFactory(res1,factory1);
		Rocket r = factory2.getBean("rocket", Rocket.class);
		System.out.println(r);
		System.out.println(r.getFuel());

	}

}
