package com.nullinjection.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nullinjection.beans.Movie;

public class NullInjectionTest {
	public static void main(String[] args) {
		
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("com/nullinjection/cfg/application-Context.xml"));
		Movie m =factory.getBean("m",Movie.class);
		System.out.println(m);
	}

}
