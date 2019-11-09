package p01;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import dto.Department;
import dto.Manager;

public class Main {

	public static void main(String[] args) {
		SessionFactory sf = 
		new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Department dept = new Department(103, "math");
		Manager mgr = new Manager(11, "chari");
		mgr.setDept(dept);
		s.save(dept);
		s.save(mgr);
		t.commit();
		s.close();
		sf.close();

	}

}
