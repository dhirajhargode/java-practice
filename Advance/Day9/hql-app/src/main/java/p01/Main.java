package p01;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import dto.Employee;

public class Main {

	public static void main(String[] args) {
		SessionFactory sf = 
				new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Employee emp = new Employee(105, "simran", 77999.99f, "cs", new Date());
		s.save(emp);
		t.commit();
		s.close();
		sf.close();

	}

}
