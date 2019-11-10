package com.nit.flipkart.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nit.flipkart.beans.Filpkart;

public class ClientApp {

	public static void main(String[] args) {
		System.out.println("Client App");
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("application-Context.xml"));
		Filpkart f = factory.getBean("fk", Filpkart.class);
		String billmsg = f.purchase(new String[] { "Mobile", "Laptop", "Watch", "Goggle" });
		System.out.println(billmsg);
	}
}
