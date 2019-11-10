package com.sarang.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sarang.domain.Employee;

public class mergeTest {
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
		emp1.setEid(16);
		emp1.setEname("sarang");
		emp1.setLname("shinde");
		emp1.setMail("sarang@gmail.com");
		emp2.setEid(16);
		emp2.setEname("sa12");
		emp2.setLname("seds11");
		emp2.setMail("sasas12");

		try {
			tx = session.beginTransaction();
			session.save(emp1);
			// session.update(emp2);// update method will throw NonUniqueObjectException
			// because another domain class object with same ID value is present is session
			// catch
			System.out.println("hello");
			Employee emp3 = (Employee) session.merge(emp2);// merge() method will not throw exception
			// It will update emp1 with emp2 data and return only emp1(old object)
			// i.e reference variable emp3 will now point to emp1(old object only)
			// i.e hashCode of emp1 and emp3 will be same here
			// if record is not available then merge method performed insert operation
			// if merger method perform insert operation then merger method will return new
			// Domain class object
			// newly returned domain class object will have different hashCode
			// method returns Domain class object
		/*	System.out.println(emp3.getEname() + " " + emp3.getLname() + " " + emp3.getMail());
			System.out.println(emp1 == emp3);
			System.out.println(emp1.hashCode());
			System.out.println(emp2.hashCode());
			System.out.println(emp3.hashCode());*/

			tx.commit();
			System.out.println("record is inserted");
		} catch (Exception e) {
			System.out.println("record is not inseted");
			e.printStackTrace();
		}
	}

}
