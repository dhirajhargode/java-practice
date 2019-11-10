package com.sarang.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Thread_Local_Hibernate_Util {
	static SessionFactory factory = null;
	static Session session = null;
	private static ThreadLocal<Session> threadlocal = null;

	static {
		Configuration cfg = null;
		cfg = new Configuration();

		cfg.configure("com/sarang/cfgs/hibernate.cfg.xml");
		factory = cfg.buildSessionFactory();

	}

	public static Session getSession() {
		if (threadlocal.get() == null) {
			session = factory.openSession();
			threadlocal.set(session);
			return session;
		}

		return threadlocal.get();
	}

	public static void closeSession() {

		session = threadlocal.get();
		session.close();
		threadlocal.remove();
	}

	public static void closeSessionFactory() {
		factory.close();

	}
}
