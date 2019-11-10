package com.don.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.don.beans.A;
import com.don.beans.B;

public class TestDependsOn {

	public static void main(String[] args) {

		Resource res = new ClassPathResource("com/don/cfg/application-Context.xml");
		BeanFactory factory = new XmlBeanFactory(res);

		A a = factory.getBean("a", A.class);
		System.out.println(a);

	}
}
