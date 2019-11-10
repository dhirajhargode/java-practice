package com.jdbc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bo.model.Employee;
import com.jdbc.dao.DBOperationDAO;

public class Test {

	public static void main(String[] args) throws Exception {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/jdbc/cfg/Application-Context.xml");
		// DBOperationService service = ctx.getBean("service",
		// DBOperationService.class);

		DBOperationDAO dao = ctx.getBean("dao", DBOperationDAO.class);

		// String record = dao.insert(1, "Roshan", "Networkin", 10000.00);
		// System.out.println(record);

		/*
		 * not working
		 */
		// System.out.println(service.showSalary(1));

		// System.out.println(dao.listEmpDetail(1));
		System.out.println(dao.listAllEmpDetail());

	}

}
