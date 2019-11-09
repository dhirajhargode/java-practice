package test;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import dto.LibraryMembership;
import dto.Student;

public class MainTest {

	public static void main(String[] args) {

		//insert();
		//displayStudent();
		displayLibrary();
	}

	public static void insert() {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction trx = s.beginTransaction();

		Student s1 = new Student(1, "Dhiraj", "Wardha");
		LibraryMembership l = new LibraryMembership(101, new Date());
		s1.setLm(l);
		s.save(s1);
		s.save(l);
		trx.commit();
		s.close();
		sf.close();
	}

	public static void displayStudent() {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction trx = s.beginTransaction();

		Query q = s.createQuery("from Student");
		List<Student> l = q.list();

		for (Student student : l) {
			System.out.println(student);
		}

		trx.commit();
		s.close();
		sf.close();
	}

	
	public static void displayLibrary() {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction trx = s.beginTransaction();

		Query q = s.createQuery("from LibraryMembership");
		List<LibraryMembership> l = q.list();

		for (LibraryMembership LibraryMembership : l) {
			System.out.println(LibraryMembership);
		}

		trx.commit();
		s.close();
		sf.close();
	}

}
