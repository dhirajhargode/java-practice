package com.spapps.payment.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.spapps.payment.beans.PaymentContext;

public class PaymentContextTest {

	public static void main(String[] args) {
		Resource res = new ClassPathResource("com/spapps/payment/cfg/application-Context.xml");
		BeanFactory factory = new XmlBeanFactory(res);

		PaymentContext ctx = factory.getBean("paymentCtx", PaymentContext.class);
		ctx.payBill(1000.00, 7979);
	}
}
