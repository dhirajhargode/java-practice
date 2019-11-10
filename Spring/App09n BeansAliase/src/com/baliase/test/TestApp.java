package com.baliase.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.baliase.beans.Parent;

public class TestApp {

	public static void main(String[] args) {
		ClassPathResource res = new ClassPathResource("com/baliase/cfg/application-Context.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		
		String[] a =factory.getAliases("parent");
		
		Parent p = factory.getBean("parent", Parent.class);
		System.out.println(p);
		
		for(String s:a) {
			System.out.println(s);
		}
		
	}
}
