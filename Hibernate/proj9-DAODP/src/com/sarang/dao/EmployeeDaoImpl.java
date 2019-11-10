package com.sarang.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sarang.domain.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public String insertEmpDetail(int empno) {

		Session session = null;
		Employee emp = new Employee();
		emp.setEid(empno);
		emp.setEname("sarang");
		emp.setLname("shinde");
		emp.setMail("sarang@gmail.com");
		session = com.sarang.util.HibernateUtil.getSession();
		System.out.println(session.hashCode());
		Transaction tx = null;

		try {
			tx = session.beginTransaction();
			session.save(emp);
			tx.commit();
			com.sarang.util.HibernateUtil.closeSession();
			return "record is inserted";

		} catch (Exception e) {
			tx.rollback();
			com.sarang.util.HibernateUtil.closeSession();
			return "object not inserted";
		}

	}

	@Override
	public String updateEmpDetail(int empno) {
		Session session = null;

		session = com.sarang.util.HibernateUtil.getSession();
		System.out.println(session.hashCode());
		com.sarang.util.HibernateUtil.closeSession();
		System.out.println(session.hashCode());
		System.out.println(session.contains(session));
		return null;
	}

	@Override
	public String deleteEmpDetail(int empno) {
		Session session = null;

		session = com.sarang.util.HibernateUtil.getSession();
		System.out.println(session.hashCode());
		com.sarang.util.HibernateUtil.closeSession();
		return null;
	}

}
