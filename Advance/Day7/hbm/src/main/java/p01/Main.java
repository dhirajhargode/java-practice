package p01;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import dto.Employee;

public class Main {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg = cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Employee e = new Employee(101, "ram", 99999.50f, new Date());
		s.save(e);
		t.commit();
		s.close();
		sf.close();
	}

}
