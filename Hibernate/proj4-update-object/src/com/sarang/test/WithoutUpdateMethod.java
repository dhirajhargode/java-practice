package com.sarang.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sarang.domain.Employee;

public class WithoutUpdateMethod {

	public static void main(String[] args) {
		Configuration cfg = null;
		SessionFactory factory = null;
		Session session = null;
		Employee emp = null;
		Transaction tx = null;
		cfg = new Configuration();

		cfg = cfg.configure("com/sarang/cfgs/hibernate.cfg.xml");
		factory = cfg.buildSessionFactory();

		session = factory.openSession();

		emp = new Employee();
		emp=session.load(Employee.class, 10);

		try {

			tx = session.beginTransaction();
			emp.setMail("sarang@yahoo");
			tx.commit();

		} catch (Exception e) {
			System.out.println("exception come while updating record");
		}
	}
}
