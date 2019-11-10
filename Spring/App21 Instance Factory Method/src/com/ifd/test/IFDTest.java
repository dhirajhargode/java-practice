package com.ifd.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ifd.beans.ATM;

public class IFDTest {

	public static void main(String[] args) {
		BeanFactory f=new XmlBeanFactory(new ClassPathResource("com/ifd/cfg/appliaction-Context.xml"));
		ATM atm = f.getBean("atm",ATM.class);
		System.out.println(atm);
	}


}
