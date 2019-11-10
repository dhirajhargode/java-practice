package com.sarang.load;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sarang.domain.Domain;
import com.sarang.proxy.proxy;

public class LoadTest {
	public static void main(String[] args) {

		Configuration cfg = null;
		SessionFactory factory = null;
		Session session = null;
		Domain d = null;
		cfg = new Configuration();
		cfg = cfg.configure("com/sarang/cfgs1/hibernate.cfg.xml");
		factory = cfg.buildSessionFactory();
		session = factory.openSession();
		proxy m = session.load(Domain.class, 1);

		System.out.println(m.getClass());
		System.out.println(m.getId());// this will not call Domain class getter method to obtain ID value
		// because proxy object it self contain ID value

		try {
			System.out.println(m.getFname());
			System.out.println(m.getClass());
		} catch (org.hibernate.ObjectNotFoundException e)

		{
			System.out.println("record not found");

		}


	}
}

