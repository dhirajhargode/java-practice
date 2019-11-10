package com.sarang.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.sarang.domain.emp;
import com.sarang.util.HibernateUtil;

public class test2 {
	public static void main(String[] args) {
		Session session = null;
		session = HibernateUtil.getSession();
		System.out.println(session.getClass().getName());
		Query query = session.getNamedQuery("SELECT_ALL_DATA1");
		query.setParameter("sal", 10000);
		List<emp> l = query.list();
		for (emp p : l) {
			System.out.println(p.getEno() + " " + p.getEname() + " " + p.getLname() + " " + p.getSalary());
		}

	}

}
