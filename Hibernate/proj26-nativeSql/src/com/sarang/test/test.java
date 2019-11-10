package com.sarang.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;

import com.sarang.HibetnetUtil.HibernetUtil;
import com.sarang.domain.emp;

public class test {
	public static void main(String[] args) {
		Session session = null;
		session = HibernetUtil.getSession();
		/*
		 * NativeQuery<emp> query = session.createNativeQuery("select * from emp",
		 * emp.class);
		 */
		// /*NativeQuery<emp> query = session.createNativeQuery("select * from emp where
		// salary=400000", emp.class);*/
		/*
		 * NativeQuery<emp> query =
		 * session.createNativeQuery("select * from emp where salary=:lname",
		 * emp.class); query.setParameter("lname", 10000);
		 */
		NativeQuery query = session.createNativeQuery("select count(*) from emp ");
		List e = query.list();
		System.out.println(e.get(0));

	}
}
