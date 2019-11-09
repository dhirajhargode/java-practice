package p01;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import dto.Department;
import dto.Employee;

public class Main {

	public static void main(String[] args) {
		SessionFactory sf = 
				new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Department dept = new Department(102,"it");
		Employee e = new Employee(103, "shyam", dept);
		Employee e1 = new Employee(104, "john", dept);
		s.save(dept);
		s.save(e);
		s.save(e1);
		t.commit();
		s.close();
		sf.close();

	}

}
