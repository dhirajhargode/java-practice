package com.sarang.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sarang.domain.EmployeeComposit;
import com.sarang.utill.util;

public class test {

	static EmployeeComposit emp, emp2 = null;
	static Session session = null;
	static Transaction tx = null;

	public static void main(String[] args) {
		session = util.getSession();
		for (int i = 1; i <= 10; i++) {
			emp = new EmployeeComposit();
			emp.setFname("sarang");
			emp.setLname("shinde");
			emp.setMail("sarang@gmail.com");
			/*
			 * emp2=new Employee(); emp2.setFname("sarang"); emp2.setLname("shinde");
			 * emp2.setMail("sarang@gmail.com");
			 */

			try {

				tx = session.beginTransaction();
				//System.out.println("sarang");
				int a = (int) session.save(emp);
				// session.save(emp2);

				System.out.println(a);
				tx.commit();

			} catch (Exception e) {
				tx.rollback();
				System.out.println("error came");
				e.printStackTrace();
			}
		}
		
	}

}
