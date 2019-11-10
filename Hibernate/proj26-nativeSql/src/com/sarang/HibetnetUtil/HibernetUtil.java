package com.sarang.HibetnetUtil;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernetUtil {

	public static SessionFactory factory = null;
	public static Configuration cfg = null;
	public static Session session = null;

	static {
		cfg = new Configuration();
		cfg = cfg.configure("com/sarang/cfgs/hibernet.cfg.xml");
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
