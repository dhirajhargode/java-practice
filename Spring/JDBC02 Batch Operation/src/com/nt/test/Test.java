package com.nt.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.dao.EmployeeDAO;
import com.nt.model.EmployeeBO;
import com.nt.util.CSVReader;

public class Test {

	public static void main(String[] args) throws Exception {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfg/application-Context.xml");
		EmployeeDAO dao = ctx.getBean("dao",EmployeeDAO.class);

		CSVReader reader =new CSVReader();
		List<EmployeeBO> emp = reader.readData();
		if(!emp.isEmpty()) {
			//System.out.println(emp);
			dao.insert(emp);
		}
	}

}
