package com.balias.test;

import java.util.Arrays;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.balias.beans.Person;

public class TestApp {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("com/balias/cfg/application-Context.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		String[] names = factory.getAliases("p,5");
		
		System.out.println(Arrays.toString(names));
	
	}

}
