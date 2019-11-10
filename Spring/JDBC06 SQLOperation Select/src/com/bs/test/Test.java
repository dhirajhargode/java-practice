package com.bs.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bs.dao.EmployeeDAO;

public class Test {
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/bs/cfg/Application-Context.xml");
		EmployeeDAO dao = ctx.getBean("dao", EmployeeDAO.class);
		System.out.println(dao.findByName("Dhiraj"));

	}
}
