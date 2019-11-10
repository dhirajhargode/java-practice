package com.sarang.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sarang.domain.Department;
import com.sarang.domain.Employee;
import com.sarang.utility.HibernateUtil;

public class add_existing_emp_to_new_department_2 {
	public static void main(String[] args) {
		Session session = HibernateUtil.getInstance();
		Transaction tx = null;
		Employee emp = session.get(Employee.class, 3);
		Department dept = new Department();
		dept.setDid(1002);
		dept.setDname("proj devl");
		emp.setDept(dept);
		try {
			tx = session.beginTransaction();
			session.update(emp);
			tx.commit();
			System.out.println("record updated");
		} catch (Exception e) {
			tx.rollback();
			System.out.println("operation failed");
			e.printStackTrace();

		}

	}

}
