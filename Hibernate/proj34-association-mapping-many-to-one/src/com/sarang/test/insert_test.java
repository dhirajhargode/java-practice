package com.sarang.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sarang.domain.Department;
import com.sarang.domain.Employee;
import com.sarang.utility.HibernateUtil;

public class insert_test {
	public static void main(String[] args) {

		Session session = HibernateUtil.getInstance();
		Employee emp = new Employee();
		Department dept = new Department();
		Transaction tx = null;
		dept.setDid(1001);
		dept.setDname("sw/devlopment");
		emp.setEid(1);
		emp.setEname("sarang");
		emp.setSalary(9431949);
		emp.setDept(dept);

		// second child
		Employee emp1 = new Employee();
		emp1.setEid(2);
		emp1.setEname("sarya");
		emp1.setSalary(4930431);
		emp1.setDept(dept);

		try {
			tx = session.beginTransaction();
			session.save(emp);
			session.save(emp1);
			tx.commit();
			System.out.println("object saved");
		} catch (Exception e) {
			tx.rollback();
			System.out.println("error has come");
			e.printStackTrace();
		}
	}

}
