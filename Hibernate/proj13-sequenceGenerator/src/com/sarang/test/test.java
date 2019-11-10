package com.sarang.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sarang.domain.Employee;
import com.sarang.utill.util;

public class test {

	static Employee emp, emp2 = null;
	static Session session = null;
	static Transaction tx = null;

	public static void main(String[] args) {
		session = util.getSession();
		emp = new Employee();
		emp.setFname("sarang");
		emp.setLname("shinde");
		emp.setMail("sarang@gmail.com");

		emp2 = new Employee();
		emp2.setFname("sagar");
		emp2.setLname("raut");
		emp2.setMail("sagar@gmail.com");

		try {

			tx = session.beginTransaction();
			System.out.println("sarang");
			int a = (int) session.save(emp);
			int b = (int) session.save(emp2);
			System.out.println("sarang");
			tx.commit();

		} catch (Exception e) {
			tx.rollback();
			System.out.println("error came");

		}
	}

}
