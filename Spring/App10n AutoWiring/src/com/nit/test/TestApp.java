package com.nit.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nit.beans.TravelAgent;

public class TestApp {

	public static void main(String[] args) {
		
		BeanFactory f=new XmlBeanFactory(new ClassPathResource("com/nit/xml/application-Context.xml"));
		TravelAgent t = (TravelAgent) f.getBean("ta");
		System.out.println(t);
		
		
	}
}
