package com.lm.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.lm.beans.TokenGenerator;

public class TestLookupMethod {

	public static void main(String[] args) {

		Resource resource = new ClassPathResource("com/lm/cfg/application-context.xml");
		BeanFactory factory = new XmlBeanFactory(resource);

		TokenGenerator tg = factory.getBean("tg", TokenGenerator.class);
		System.out.println(tg.getToken().hashCode());
		System.out.println(tg.getToken().hashCode());
	}
}
