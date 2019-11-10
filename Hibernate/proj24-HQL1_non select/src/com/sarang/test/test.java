package com.sarang.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.sarang.domain.emp;
import com.sarang.util.util;

public class test {
	public static void main(String[] args) {

		Session session = null;
		session = util.getSession();
		/* Query query = session.createQuery("from emp"); */

		// positional parameter
		/*
		 * Query query = session.createQuery("from emp where eno=?");
		 * query.setParameter(0, 1);
		 */

		// named parameter
		/*
		 * Query query =
		 * session.createQuery("from emp where eno >=:min and eno <=:max ");
		 * query.setParameter("min", 1); query.setParameter("max", 3);
		 */

		// jpa style named parameter

		Query query = session.createQuery("from emp where eno>=?1 and  eno <=?4");
		query.setParameter("1", 1);
		query.setParameter("4", 5);

		List<emp> list = query.list();

		for (emp e : list) {

			System.out.println(e.getEno() + " " + e.getEname() + " " + e.getLname() + " " + e.getSalary());

		}
	}

}
