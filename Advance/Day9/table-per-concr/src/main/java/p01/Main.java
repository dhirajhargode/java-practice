package p01;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import dto.Clerk;
import dto.Manager;

public class Main {

	public static void main(String[] args) {
		SessionFactory sf = 
				new AnnotationConfiguration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Manager m = new Manager(101, "ram", 9999.50f, 900f, 800f);
		Clerk c = new Clerk(102, "hari", 7777.50f, 600f);
		s.save(m);
		s.save(c);
		t.commit();
		s.close();
		sf.close();

	}

}
