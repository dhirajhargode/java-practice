package com.ib.test;

import javax.annotation.Resource;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ib.beans.ATM;

public class TestApp {
	public static void main(String[] args) {

		ClassPathResource res = new ClassPathResource("com/ib/cfg/application-Context.xml");
		BeanFactory factory = new XmlBeanFactory(res);

		ATM atm = factory.getBean("atm", ATM.class);
		atm.withdraw(2010.00);

	}

}
