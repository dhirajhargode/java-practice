package com.sarang.test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

import com.sarang.domain.Employee;
import com.sarang.util.HibernateUtil;

public class test {
	public static void main(String[] args) {
		Session sess;
		sess = HibernateUtil.getSession();
		Criteria cr = sess.createCriteria(Employee.class);
		List<Employee> list = cr.list();
		for (Employee emp : list) {
			System.out.println(emp.getEid() + " " + emp.getEname() + " " + emp.getLname() + " " + emp.getMail());
		}
	}

}
