package Main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import dto.Employee;

public class Main {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		Employee e=new Employee(1,"sagar",120000);
		s.save(e);
		t.commit();
		s.close();
		sf.close();
	}

}