package com.sarang.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sarang.domain.Employee;

public class dao {

public static void main(String[] args) {

		Configuration cfg = null;
		SessionFactory factory = null;
		Session session = null;
		Transaction tx = null;
		Employee emp=null;
		cfg = new Configuration();
		cfg = cfg.configure("/com/sarang/cfgs/hibernate.cfg.xml");
		factory=cfg.buildSessionFactory();
		session=factory.openSession();
		emp=new Employee();
		emp.setEid("1");
		emp.setFname("sarang");
		emp.setLname("shinde");
		emp.setMail("klk");
		try {
			tx=session.beginTransaction();
			session.save(emp);
			tx.commit();
		}catch (Exception e) {
			// TODO: handle exception
			tx.rollback();
			e.printStackTrace();
		}
		
		
	}
}