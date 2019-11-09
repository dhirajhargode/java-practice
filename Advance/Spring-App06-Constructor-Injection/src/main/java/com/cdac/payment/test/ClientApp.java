package com.cdac.payment.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.cdac.payment.bean.PaymentContext;

public class ClientApp {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("cfg.xml");

		PaymentContext pc = (PaymentContext) ctx.getBean("pc");
		String status = pc.payBill(10000.0d, 4321);
		System.out.println(status);
	}

}
