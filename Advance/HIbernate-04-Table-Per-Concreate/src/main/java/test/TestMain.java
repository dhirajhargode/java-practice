package test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import dto.Clerk;
import dto.Employee;
import dto.Manager;

public class TestMain {

	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction trx = s.beginTransaction();

		// Manager m = new Manager(101, "sai", 23255.02d, 900d, 800d);
		// Clerk c = new Clerk(102, "hari", 7777.50d, 600d);
		// s.save(m);
		// s.save(c);

		// Query q = s.createQuery("from Employee");
		Query q = s.createQuery("from Manager");
		// Query q = s.createQuery("from Clerk");

		List<Object> l = q.list();

		for (Object e : l) {
			System.out.println((Manager)e);
		}

		
		trx.commit();
		s.close();
		sf.close();
	}
}
