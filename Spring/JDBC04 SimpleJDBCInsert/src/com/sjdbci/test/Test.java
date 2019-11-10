package com.sjdbci.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sjdbci.dao.EmployeeDAO;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/sjdbci/cfg/Application-Context.xml");
		EmployeeDAO dao = ctx.getBean("dao", EmployeeDAO.class);
		System.out.println("Row Inserted : "+dao.insert(2, "Sarang", "Devloper", 20000.00));
		}

}
