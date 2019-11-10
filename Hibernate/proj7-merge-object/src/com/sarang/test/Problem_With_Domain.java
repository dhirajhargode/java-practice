package com.sarang.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sarang.domain.Employee;

public class Problem_With_Domain {
	public static void main(String[] args) {
		Configuration cfg = null;
		SessionFactory factory = null;
		Session session = null;
		Transaction tx = null;
		Employee emp1, emp2;

		cfg = new Configuration();
		cfg = cfg.configure("com/sarang/cfgs/hibernate.cfg.xml");
		factory = cfg.buildSessionFactory();
		session = factory.openSession();
		emp1 = new Employee();
		emp2 = new Employee();
		emp1.setEid(4);
		emp1.setEname("sarang");
		emp1.setLname("shinde");
		emp1.setMail("sarang@gmail.com");
		emp2.setEid(4);
		emp2.setEname("sa12");
		emp2.setLname("seds11");
		emp2.setMail("sasas12");
		try {
			tx = session.beginTransaction();
			session.save(emp1);
			
			session.update(emp2);
			System.out.println(emp1.hashCode());
			System.out.println(emp2.hashCode());
			
			//tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("object not inserted");

		}
	}

}
