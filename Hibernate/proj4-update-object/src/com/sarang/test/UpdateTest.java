package com.sarang.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sarang.domain.Employee;

public class UpdateTest {

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

		emp.setEid(3);

		emp.setEname("sarang12");

		try {
			tx = session.beginTransaction();
			session.update(emp);
			tx.commit();

		} catch (Exception e) {
			System.out.println("exception has come");
		}
	}
}
