package com.sarang.Utility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static Configuration cfg;
	private static SessionFactory factory;

	static {
		cfg = new Configuration();
		cfg = cfg.configure("com/sarang/cfgs/hibernate.cfg.xml");
		factory = cfg.buildSessionFactory();
	}

	public static Session getInstance() {
		return factory.openSession();

	}

	public static void closeSession(Session session) {
		session.close();
	}

	public static void closeFactory() {
		factory.close();

	}

}
