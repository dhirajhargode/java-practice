package p01;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import dto.Department;
import dto.Manager;

public class Main3 {

	public static void main(String[] args) {
		SessionFactory sf = 
		new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Query q = s.createQuery("from Manager");
		List<Manager> list = q.list();
		for(Manager d : list) {
			System.out.println(d);
			System.out.println(d.getDept());
		}
		t.commit();
		s.close();
		sf.close();

	}

}
