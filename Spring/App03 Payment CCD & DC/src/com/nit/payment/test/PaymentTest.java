package com.nit.payment.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nit.payment.beans.PaymentContext;

public class PaymentTest {

	public static void main(String[] args) {
		
		ClassPathResource res= new ClassPathResource("application-Context.xml");
		BeanFactory factory=new XmlBeanFactory(res);
		PaymentContext pc=factory.getBean("paymentCntx", PaymentContext.class);
		pc.payBill(10000.00,7878);
		
	}
}
