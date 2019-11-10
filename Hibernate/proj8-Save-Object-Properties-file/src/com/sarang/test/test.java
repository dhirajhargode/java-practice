package com.sarang.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sarang.domain.Domain;

public class test {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.addFile("src/com/sarang/cfgs/Domain.hbm.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Domain domain = new Domain();
		domain.setId(999);
		domain.setFname("sarang");
		domain.setLname("shinde");
		domain.setMail("sa");
		try {
			Transaction tx = session.beginTransaction();
			session.persist(domain);

			tx.commit();
			// System.out.println("object inserted");

		} catch (Exception e) {
			e.printStackTrace();
		System.out.println("object not inserted");

		}

	}

}
