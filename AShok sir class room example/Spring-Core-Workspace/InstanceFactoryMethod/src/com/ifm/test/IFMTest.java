package com.ifm.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.ifm.beans.ATM;

public class IFMTest {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("com/ifm/cfg/application-Context.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		ATM atm = factory.getBean("atm", ATM.class);
		System.out.println(atm);
	}

}
