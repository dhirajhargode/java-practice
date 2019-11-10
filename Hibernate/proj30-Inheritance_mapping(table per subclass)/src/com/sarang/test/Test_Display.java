package com.sarang.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.sarang.Utility.HibernateUtil;
import com.sarang.domain.Customer;
import com.sarang.domain.Employee;

public class Test_Display {
	public static void main(String[] args) {

		Session session = HibernateUtil.getInstance();
		Query query = session.createQuery("from Employee");
		Query query1 = session.createQuery("from Customer");
		List<Employee> list = query.list();
		list.forEach(i -> {
			System.out.println(i);

		});

		List<Customer> list1 = query1.list();
		list1.forEach(i -> {
			System.out.println(i);

		});

	}

}
