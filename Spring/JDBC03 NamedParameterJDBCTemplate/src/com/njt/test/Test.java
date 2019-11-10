package com.njt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.njt.dao.EmployeeDao;

public class Test {
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/njt/cfg/Application-Context.xml");
		EmployeeDao dao = ctx.getBean("empdao", EmployeeDao.class);
		// dao.insertEmploy(1, "Dhiraj", "ASE", 5000.00);
		// System.out.println(dao.findName(1));
		System.out.println(dao.findEmpDetailByName("Dhiraj"));

	}

}
