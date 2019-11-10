package com.sarang.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sarang.domain.Department;
import com.sarang.domain.Employee;
import com.sarang.utility.HibernateUtil;

public class change_dept_of_emp {
	public static void main(String[] args) {
		Session session = HibernateUtil.getInstance();
		Transaction tx = null;
		Employee emp = session.get(Employee.class, 1);
		Department dept = session.get(Department.class, 1002);
		emp.setDept(dept);
		try {
			tx = session.beginTransaction();
			session.update(emp);
			tx.commit();
			System.out.println("department of employee is changed");

		} catch (Exception e) {
			tx.rollback();
			System.out.println("operation failed");
			e.printStackTrace();
		}

	}
}
