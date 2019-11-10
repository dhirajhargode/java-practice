package com.ara.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ara.beans.BillGenerate;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/ara/cfg/Application-Context.xml");
		BillGenerate bg = ctx.getBean("bg",BillGenerate.class);
		bg.generateBill(55555);
	}

}
