package com.glo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.glo.domain.Domain;

public class TestGet {

	static Transaction tx = null;

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg = cfg.configure("com/glo/cfgs/Configurtion.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Domain d = new Domain();

		d.setId(2);
		d.setName("sushil");
		d.setLname("mankar");

		try {
			tx = session.beginTransaction();
			session.save(d);
			System.out.println("saved...");
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
	}

}
