package com.sarang.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.sarang.domain.emp;
import com.sarang.util.HibernateUtil;

public class test {
	public static void main(String[] args) {
		Session session = null;
		session = HibernateUtil.getSession();
		System.out.println(session.getClass().getName());
		Query query = session.getNamedQuery("SELECT_ALL_DATA");
		List<emp> l = query.list();
		for (emp p : l) {
			System.out.println(p.getEno() + " " + p.getEname() + " " + p.getLname() + " " + p.getSalary());
		}

	}

}
