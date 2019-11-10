package com.sarang.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sarang.domain.Customer;
import com.sarang.domain.Employee;
import com.sarang.domain.person;
import com.sarang.utility.HibernateUtil;

public class test {
	public static void main(String[] args) {
		Session session = null;
		Transaction tx = null;
		session = HibernateUtil.getInstance();
		person per = new person();
		Employee emp = new Employee();
		Customer cusst = new Customer();
		per.setPid(4);
		per.setName("sarang");
		per.setCompony("oracle corporation");
		emp.setPid(5);
		emp.setName("sarang");
		emp.setCompony("ibm");
		emp.setDepartment("400000");
		emp.setDepartment("SW");
		cusst.setPid(6);
		cusst.setName("john");
		cusst.setCompony("american bank");
		cusst.setAddress("US");

		try {

			tx = session.beginTransaction();
			session.save(emp);
			session.save(per);
			session.save(cusst);
			tx.commit();
			System.out.println("object inserted");
		} catch (Exception e) {
			System.out.println("object not inserted");
			e.printStackTrace();
		}

	}

}
