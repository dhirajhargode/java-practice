package com.sarang.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.sarang.domain.Customer;
import com.sarang.domain.Employee;
import com.sarang.domain.person;
import com.sarang.utility.HibernateUtil;

public class DisplayTest {
	public static void main(String[] args) {
		Session session = HibernateUtil.getInstance();
		Query query = session.createQuery("from person");
		List<Employee> list = query.list();
		System.out.println(list.getClass().getName());
		list.forEach(p -> {
			System.out.println(p.getPid() + " " + p.getName() + " " + p.getCompony() + " " + p.getDepartment() + " "
					+ p.getSalary());
			System.out.println(p.getClass().getName());
		});
		/*
		 * System.out.println(
		 * "--------------------------------------------------------------------------")
		 * ;
		 * 
		 * Query query1 = session.createQuery("from Employee"); List<Employee> list1 =
		 * query1.list(); list1.forEach(e -> { System.out.println(e.getPid() + " " +
		 * e.getName() + " " + e.getCompony() + " " + e.getDepartment() + " " +
		 * e.getSalary()); });
		 * 
		 * System.out.println(
		 * "--------------------------------------------------------------------------")
		 * ;
		 * 
		 * Query query2 = session.createQuery("from Customer"); List<Customer> list2 =
		 * query2.list(); list2.forEach(c -> { System.out.println(c.getPid() + " " +
		 * c.getName() + " " + c.getCompony() + " " + c.getAddress()); });
		 */
	}

}
