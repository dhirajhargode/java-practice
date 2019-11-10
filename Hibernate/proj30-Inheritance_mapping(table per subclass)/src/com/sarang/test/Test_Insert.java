package com.sarang.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sarang.Utility.HibernateUtil;
import com.sarang.domain.Customer;
import com.sarang.domain.Employee;

public class Test_Insert {
	public static void main(String[] args) {

		Session session = HibernateUtil.getInstance();
		Employee emp = new Employee();
		Customer cst = new Customer();

		emp.setPid(1);
		emp.setName("sarang");
		emp.setCompony("Orcle");
		emp.setDepartment("SW");
		emp.setSalary(300000);
		cst.setPid(2);
		cst.setName("john");
		cst.setCompony("BOA");
		cst.setAddress("new york");

		try {
			Transaction tx = session.beginTransaction();
			session.save(emp);
			session.save(cst);
			tx.commit();
			System.out.println("object is inserted");
		} catch (Exception ex) {
			System.out.println("object not inserted");
			ex.printStackTrace();
		}

	}

}
