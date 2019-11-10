package com.sarang.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sarang.domain.Employee;
import com.sarang.utill.util;

public class test {

	static Employee emp = null;
	static Session session = null;
	static Transaction tx = null;

	public static void main(String[] args) {
		session = util.getSession();
		emp = new Employee();
		emp.setEid(1);
		emp.setEname("sarang");
		emp.setLname("shinde");
		emp.setMail("sarang@gmail.com");

		try {

			tx = session.beginTransaction();
			int a = (int) session.save(emp);

			System.out.println(a);

			tx.commit();

		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();

		}
	}

}
