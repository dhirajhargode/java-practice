package com.bpp.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.bpp.beans.ConnectionProvider;

public class TestApp {

	public static void main(String[] args) {

		ClassPathResource res = new ClassPathResource("com/bpp/cfg/application-Context.xml");
		BeanFactory factory = new XmlBeanFactory(res);

		// get propertyplaceholder config object
		BeanFactoryPostProcessor bfp = factory.getBean("ppc", PropertyPlaceholderConfigurer.class);

		// register bean factory post processor
		ConfigurableListableBeanFactory cfactory=(ConfigurableListableBeanFactory)factory;
		bfp.postProcessBeanFactory(cfactory);
		

		ConnectionProvider cp = factory.getBean("conProvider", ConnectionProvider.class);
		System.out.println(cp);

	}

}
