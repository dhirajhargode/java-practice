package p01;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import dto.Department;
import dto.Employee;

public class Main2 {

	public static void main(String[] args) {
		SessionFactory sf = 
				new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Query q = s.createQuery("from Department");
		List<Department> list = q.list();
		Iterator<Department> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		t.commit();
		s.close();
		sf.close();

	}

}
