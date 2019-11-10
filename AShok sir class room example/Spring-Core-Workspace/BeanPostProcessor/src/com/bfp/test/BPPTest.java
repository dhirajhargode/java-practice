package com.bfp.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.bfp.beans.A;
import com.bfp.beans.CustomBeanPostProcessor;

public class BPPTest {

	public static void main(String[] args) {

		Resource resource = new ClassPathResource("com/bfp/cfg/application-Context.xml");
		BeanFactory factory = new XmlBeanFactory(resource);

		CustomBeanPostProcessor cBpp = factory.getBean("cBpp", CustomBeanPostProcessor.class);

		// Registering bean post processor
		ConfigurableListableBeanFactory cFactory = (ConfigurableListableBeanFactory) factory;
		cFactory.addBeanPostProcessor(cBpp);

		A a = factory.getBean("a", A.class);
		System.out.println(a);
	}
}
