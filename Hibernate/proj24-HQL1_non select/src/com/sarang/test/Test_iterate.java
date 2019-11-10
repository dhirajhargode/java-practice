package com.sarang.test;

import java.util.Iterator;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.sarang.domain.emp;
import com.sarang.util.util;

public class Test_iterate {
	public static void main(String[] args) {
		Session session = util.getSession();
		Query query = session.createQuery("from emp where salary>:min and salary<:max");
		query.setParameter("min", 11000);
		query.setParameter("max", 40000);
		Iterator<emp> it = query.iterate();
		while (it.hasNext()) {
			emp e = it.next();

			
			System.out.println(e.getEno());
			
		}

	}

}
