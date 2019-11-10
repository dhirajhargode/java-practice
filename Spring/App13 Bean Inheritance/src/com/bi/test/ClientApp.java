package com.bi.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.bi.beans.Moblie;

public class ClientApp {

	public static void main(String[] args) {
		
	
	BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/bi/cfg/application-Context.xml"));
	
	Moblie m = factory.getBean("mobile1", Moblie.class);
	System.out.println(m);
	
	Moblie m2 = factory.getBean("mobile2", Moblie.class);
	System.out.println(m2);
	
	Moblie m3 = factory.getBean("mobile3", Moblie.class);
	System.out.println(m3);
	
	}
	
}
