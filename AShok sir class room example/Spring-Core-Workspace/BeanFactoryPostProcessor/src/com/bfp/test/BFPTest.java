package com.bfp.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.bfp.beans.ConnectionProvider;

public class BFPTest {

	public static void main(String[] args) {

		/*
		 * Resource resource = new
		 * ClassPathResource("com/bfp/cfg/application-Context.xml"); BeanFactory
		 * factory = new XmlBeanFactory(resource);
		 * 
		 * BeanFactoryPostProcessor bfp = factory.getBean("bfp",
		 * BeanFactoryPostProcessor.class);
		 * 
		 * // Registering bean factory post processor
		 * ConfigurableListableBeanFactory cbf =
		 * (ConfigurableListableBeanFactory) factory;
		 * bfp.postProcessBeanFactory(cbf);
		 */

		ApplicationContext context = new ClassPathXmlApplicationContext("com/bfp/cfg/application-Context.xml");

		ConnectionProvider cp = context.getBean("conProvider", ConnectionProvider.class);
		System.out.println(cp);

	}
}
