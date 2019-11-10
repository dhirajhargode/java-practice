package com.sarang.get;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sarang.domain.Domain;

public class test {
	public static void main(String[] args) {
		Configuration cfg = null;
		SessionFactory factory = null;
		Session session = null;
		Domain d = null;

		cfg = new Configuration();
		cfg = cfg.configure("com/sarang/cfgs/hibernate.cfg.xml");
		factory = cfg.buildSessionFactory();
		session = factory.openSession();

		d = session.get(Domain.class, 1);// perform eager/early loading...
		// i.e record is loaded at this line only(line no 20) weather we are using that
		// data or not
		// read all that using select query and set into object by calling setter
		// methods
		// returns null if data not found

		// System.out.println(d.getClass());
		if (d == null) {
			System.out.println(d.getMail());

		}

	}

}
