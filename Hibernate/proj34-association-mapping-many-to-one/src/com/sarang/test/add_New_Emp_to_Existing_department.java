package com.sarang.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sarang.domain.Department;
import com.sarang.domain.Employee;
import com.sarang.utility.HibernateUtil;

public class add_New_Emp_to_Existing_department {
	public static void main(String[] args) {
		Session session = HibernateUtil.getInstance();
		Transaction tx = null;
		Department dept = session.get(Department.class, 1001);
		Employee emp = new Employee();
		emp.setEid(3);
		emp.setEname("sara");
		emp.setSalary(212212121);
		emp.setDept(dept);
		try {
			tx = session.beginTransaction();
			session.save(emp);
			tx.commit();
			System.out.println("new employees are added to existing department ");
		} catch (Exception e) {
			tx.rollback();
			System.out.println("operation failed");
			e.printStackTrace();
		}

	}

}
