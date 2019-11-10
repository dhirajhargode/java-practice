package com.sarang.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Util {
	static Configuration cfg = null;
	static SessionFactory factory = null;
	static Session session = null;

	static {
		cfg = new Configuration();
		cfg = cfg.configure("src/com/sarang/cfgs/hibernate.cfg.xml");
		factory = cfg.buildSessionFactory();

	}

	public static Session getSession() {
		return session = factory.openSession();
	}

	public static void closeSession(Session session) {
		session.close();
	}

	public static void closeFactory() {
		factory.close();
	}
}
