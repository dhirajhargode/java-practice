package com.sarang.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static Configuration cfg = null;
	private static SessionFactory factory = null;
	
	static {
		cfg = new Configuration();
		cfg = cfg.configure("com/sarang/cfgs/hibernate.cfg.xml");
		factory = cfg.buildSessionFactory();

	}

	public static Session getSession() {
		return factory.openSession();

	}

	public static void closeSession(Session session) {
		session.close();
	}

	public static void closeFactory() {
		factory.close();
	}
}
