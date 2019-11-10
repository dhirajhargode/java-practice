package com.sarang.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	static SessionFactory factory = null;
	static Session session = null;
	static {
		Configuration cfg = null;

		cfg = new Configuration();
		cfg.configure("com/sarang/cfgs/hibernate.cfg.xml");
		factory = cfg.buildSessionFactory();

	}

	public static Session getSession() {
		session = factory.openSession();
		return session;
	}

	public static void closeSession() {
		System.out.println(session.hashCode());
		session.close();
	}

	public static void closeSessionFactory() {
		factory.close();
	}
}