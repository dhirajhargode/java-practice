package com.sarang.test;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sarang.domain.Annotation;

public class test {

	public static void main(String[] args) {
		Configuration cfg = null;
		SessionFactory factory = null;
		Session session = null;
		Transaction tx = null;
		Annotation ann = null;
		cfg = new Configuration();
		cfg = cfg.configure("com/sarang/cfgs/hibernate.cfg.xml");
		factory = cfg.buildSessionFactory();
		session = factory.openSession();
		ann = new Annotation();
		ann.setEid(7);
		ann.setFname("sarang");
		ann.setLname("shinde");
		ann.setSalary(10);
		try {

			tx = session.beginTransaction();
			int id = (int) session.save(ann);
			System.out.println(id);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
