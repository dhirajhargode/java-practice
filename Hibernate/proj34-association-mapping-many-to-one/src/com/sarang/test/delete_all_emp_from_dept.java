package com.sarang.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.sarang.domain.Employee;
import com.sarang.utility.HibernateUtil;

public class delete_all_emp_from_dept {
	public static void main(String[] args) {
		Session session = HibernateUtil.getInstance();
		Transaction tx = null;
		Query query = session.createQuery("from Employee");
		List<Employee> emplist = query.list();
		for (Employee emp : emplist) {
			try {
				tx = session.beginTransaction();
				session.delete(emp);
				tx.commit();
				System.out.println("deleted");
			} catch (Exception e) {
				tx.rollback();
				System.out.println("failed");
				e.printStackTrace();
			}
		}

	}
}
