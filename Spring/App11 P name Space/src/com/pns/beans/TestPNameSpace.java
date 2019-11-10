package com.pns.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class TestPNameSpace {
	public static void main(String[] args) {
		
		ClassPathResource res=new ClassPathResource("com/pns/cfg/appliaction-Context.xml");
		BeanFactory factory=new XmlBeanFactory(res);
		Car c=factory.getBean("car",Car.class);
		System.out.println(c);
	}

}
