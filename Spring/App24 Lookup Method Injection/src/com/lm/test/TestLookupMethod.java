package com.lm.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.lm.beans.TokenGenerator;

public class TestLookupMethod {

	public static void main(String[] args) {

		// BeanFactory factory = new XmlBeanFactory(new
		// ClassPathResource("com/lm/cfg/application-Context.xml"));

		ApplicationContext factory = new ClassPathXmlApplicationContext("com/lm/cfg/application-Context.xml");
		TokenGenerator tg = factory.getBean("tg", TokenGenerator.class);
		System.out.println(tg.getToken().hashCode());

		TokenGenerator tg1 = factory.getBean("tg", TokenGenerator.class);
		System.out.println(tg1.getToken().hashCode());

	}

}
