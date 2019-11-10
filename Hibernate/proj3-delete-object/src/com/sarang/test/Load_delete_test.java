package com.sarang.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sarang.domain.Employee;

public class Load_delete_test {
	public static void main(String[] args) {
		Configuration cfg = null;
		SessionFactory factory = null;
		Session session = null;
		Transaction tx = null;
		Employee emp = null;

		cfg = new Configuration();
		cfg = cfg.configure("com/sarang/cfgs/hibernate.cfg.xml");
		factory = cfg.buildSessionFactory();
		session = factory.openSession();
		emp = new Employee();
		emp = session.get(Employee.class, 2);
		if (emp != null) {
			try {
				tx = session.beginTransaction();
				session.delete(emp);
				tx.commit();
				//System.out.println("record deleted");
			} catch (Exception e) {
				System.out.println("record not deleted");
			}
		}

		else {
			System.out.println("record not available");
		}
	}
}
