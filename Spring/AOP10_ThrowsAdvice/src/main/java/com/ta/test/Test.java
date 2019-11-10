package com.ta.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ta.beans.DeptDao;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext ctx =new ClassPathXmlApplicationContext("com/ta/cfg/Application-Context.xml");
		DeptDao dept = ctx.getBean("dept",DeptDao.class);
		dept.insert(10);
		
	}

}
