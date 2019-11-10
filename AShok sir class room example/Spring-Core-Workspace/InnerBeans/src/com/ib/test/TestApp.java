package com.ib.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.ib.beans.ATM;
import com.ib.beans.SonyPrinter;

public class TestApp {

	public static void main(String[] args) {

		Resource resource = new ClassPathResource("com/ib/cfg/application-Context.xml");
		BeanFactory factory = new XmlBeanFactory(resource);

		ATM atm = factory.getBean("atm", ATM.class);
		atm.withdraw(28888000.00);

	}

}
