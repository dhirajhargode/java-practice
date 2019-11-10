package com.sarang.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	static SessionFactory factory = null;
	static Configuration cfg = null;
	static Session session = null;

	static {
		Configuration cfg = new Configuration();
		cfg = cfg.configure("com/sarang/cfgs/hibernate.cfg.xml");
		factory = cfg.buildSessionFactory();

	}

	public static Session getSession() {
		System.out.println("sarang");
		return session = factory.openSession();
	}

	public static void closeSession(Session session) {
		session.close();
	}

	public static void closeFactory() {
		factory.close();
	}

}
