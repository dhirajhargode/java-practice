package com.awi.cfg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.awi.beans.OrderManage;

public class AwareInterfaceTest {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx =new ClassPathXmlApplicationContext("com/awi/cfg/application-Context.xml");
		OrderManage om = ctx.getBean("om",OrderManage.class);
		om.deliveryProduct(50000);
		
	}

}
