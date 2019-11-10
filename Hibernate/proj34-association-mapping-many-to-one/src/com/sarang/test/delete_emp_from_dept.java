package com.sarang.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sarang.domain.Employee;
import com.sarang.utility.HibernateUtil;

public class delete_emp_from_dept {
	public static void main(String[] args) {
		Session session = HibernateUtil.getInstance();
		Employee emp = session.get(Employee.class, 1);
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.delete(emp);
			tx.commit();
			System.out.println("emp deleted");
		} catch (Exception e) {
			tx.rollback();
			System.out.println("operation failed");
			e.printStackTrace();
		}

	}

}
