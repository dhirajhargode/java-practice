package com.sarang.test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.sarang.domain.Department;
import com.sarang.domain.Employee;
import com.sarang.utility.HibernateUtil;

public class loadTest {
	public static void main(String[] args) {
		Session session = HibernateUtil.getInstance();
		Employee emp = new Employee();
		List<Employee> emplist = new ArrayList();
		Query query = session.createQuery("from Employee");
		emplist = query.list();
		emplist.forEach(el -> {
			System.out.print(el.getEid() + " " + el.getEname() + " " + el.getSalary() + " ");
			Department dept = el.getDept();
			System.out.println(dept.getDid() + " " + dept.getDname());

		});

	}
}
