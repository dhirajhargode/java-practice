package com.sarang.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sarang.domain.Employee;

public class test {
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
		emp.setEid(30);
		// emp.setEname("pranad");
		// emp.setLname("kaashvi");
		emp.setMail("kaashvi@yho");
		try {
			tx = session.beginTransaction();
			session.saveOrUpdate(emp);
			tx.commit();
			System.out.println("object is inserted or updated");
		} catch (Exception e) {
			System.out.println("object is not updated or inserted");
		}

	}

}
