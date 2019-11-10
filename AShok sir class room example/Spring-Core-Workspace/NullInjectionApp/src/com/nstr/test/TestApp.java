package com.nstr.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nstr.beans.Movie;

public class TestApp {

	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/nstr/cfg/application-Context.xml"));
		Movie m = factory.getBean("movie", Movie.class);
		System.out.println(m);
	}
}
