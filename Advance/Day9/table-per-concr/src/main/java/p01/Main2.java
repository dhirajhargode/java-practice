package p01;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import dto.Clerk;
import dto.Employee;
import dto.Manager;

public class Main2 {

	public static void main(String[] args) {
		SessionFactory sf = 
				new AnnotationConfiguration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
//		Query q = s.createQuery("from Employee");
//		Query q = s.createQuery("from Manager");
		Query q = s.createQuery("from Clerk");
		List<Employee> l = q.list();
		for(Employee e : l) {
			System.out.println(e);
		}
		t.commit();
		s.close();
		sf.close();

	}

}
