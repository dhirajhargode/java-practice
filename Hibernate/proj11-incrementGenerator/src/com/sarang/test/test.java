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
		emp.setEid(1);
		emp.setFname("sarang");
		emp.setLname("shinde");
		emp.setMail("sarang@gmail.com");
		emp2 = new Employee();
		emp.setEid(3);
		emp.setFname("sagar");
		emp.setLname("raut");
		emp.setMail("sagar@gmail.com");

		try {

			tx = session.beginTransaction();
			int a = (int) session.save(emp);
			int b = (int) session.save(emp2);
			System.out.println(a);
			System.out.println(b);
			tx.commit();

		} catch (Exception e) {
			tx.rollback();

		}
	}

}
