package p01;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import dto.Course;
import dto.Subject;

public class Main {

	public static void main(String[] args) {
		SessionFactory sf = 
				new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Course c = new Course(30, "java-framework");
		Subject s1 = new Subject(107, "spring");
		Subject s2 = new Subject(108, "struts");
		Subject s3 = new Subject(109, "jsf");
		c.getSubjects().add(s1);
		c.getSubjects().add(s2);
		c.getSubjects().add(s3);
		
		s.save(c);
		s.save(s1);
		s.save(s2);
		s.save(s3);
		
		t.commit();
		s.close();
		sf.close();

	}

}
