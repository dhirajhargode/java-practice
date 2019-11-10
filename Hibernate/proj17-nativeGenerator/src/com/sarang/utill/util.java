package com.sarang.utill;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class util {
	public static Session session = null;
	public static SessionFactory factory = null;
	static {
		Configuration cfg = new Configuration();
		//cfg = cfg.configure("/com/sarang/cfgs/hibernate.cfg.xml");
		cfg = cfg.configure("/com/sarang/domain/hibernate.cfg.xml");
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
