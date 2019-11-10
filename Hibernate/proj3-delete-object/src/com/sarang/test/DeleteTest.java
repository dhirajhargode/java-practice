package com.sarang.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sarang.domain.Employee;

public class DeleteTest {

	public static void main(String[] args) {
		Configuration cfg = null;
		SessionFactory factory = null;
		Session session = null;
		Employee emp = null;
		Transaction tx = null;

		emp = new Employee();
		emp.setEid(1);
		cfg = new Configuration();
		cfg = cfg.configure("com/sarang/cfgs/hibernate.cfg.xml");
		factory = cfg.buildSessionFactory();
		session = factory.openSession();
		try {
			tx = session.beginTransaction();

			session.delete(emp);

			tx.commit();
			//System.out.println("object deleted");

		} catch (Exception e) {
			System.out.println("object not deleted");
		}

	}
}
