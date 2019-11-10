package com.sc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sc.bo.EmployeeBO;
import com.sc.dao.EmployeeDAO;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/sc/cfg/Application-Context.xml");
		EmployeeDAO dao = ctx.getBean("dao",EmployeeDAO.class);
		dao.getEmpDetail(1);
	}
}
