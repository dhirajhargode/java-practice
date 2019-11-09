package p01;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import dto.Course;
import dto.Subject;

public class Main3 {

	public static void main(String[] args) {
		SessionFactory sf = 
				new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		Query q = s.createQuery("from Course");
		List<Course> list = q.list();
		for(Course c : list) {
			System.out.println(c);
			for(Subject sub : c.getSubjects()) {
				System.out.println(sub);
			}
		}
		t.commit();
		s.close();
		sf.close();

	}

}
