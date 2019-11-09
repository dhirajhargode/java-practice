package com.cdac.app01.dto;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainTest {

	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Employee e = new Employee(1, "Dhiraj", 20000.0, new Date());
		s.save(e);
		t.commit();
		s.close();
		sf.close();
	}

}
