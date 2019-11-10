package com.sarang.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sarang.domain.Employee;

public class LoadUpdateTest {

	public static void main(String[] args) {

		Configuration cfg = null;
		SessionFactory factory = null;
		Session session = null;
		Employee emp = null;
		Transaction tx = null;
		cfg = new Configuration();

		cfg = cfg.configure("com/sarang/cfgs/hibernate.cfg.xml");
		factory = cfg.buildSessionFactory();

		session = factory.openSession();

		emp = new Employee();
		emp=session.get(Employee.class,9);
		if(emp!=null)
		{	emp.setMail("sarang@yahoo");
			try
			{
			tx=session.beginTransaction();
			session.update(emp);
			tx.commit();
			}
			catch(Exception e) {
			System.out.println("updation fail");
		}
		}
		
		else
		{
			System.out.println("rocord not available to update");
		}
		
	}

}
