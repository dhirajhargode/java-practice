package com.blc.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.blc.beans.Motor;

public class TestBeanlifeCycle {
	public static void main(String[] args) {
		
		ClassPathResource res=new ClassPathResource("com/blc/cfg/application-Context.xml");
		
		BeanFactory factory=new XmlBeanFactory(res);
		
		Motor m = factory.getBean("motor",Motor.class);
		m.doWork();
		
		ConfigurableListableBeanFactory cfactory = (ConfigurableListableBeanFactory) factory;
		cfactory.destroySingletons();
		
	}

}
