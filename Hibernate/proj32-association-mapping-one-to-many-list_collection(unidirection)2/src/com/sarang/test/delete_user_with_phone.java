package com.sarang.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sarang.domain.User;
import com.sarang.utility.HibernateUtil;

public class delete_user_with_phone {
	public static void main(String[] args) {
		Session session = HibernateUtil.getInstance();
		User user = null;
		Transaction tx = null;
		user = session.get(User.class, 1);
		try {
			tx = session.beginTransaction();
			session.delete(user);
			tx.commit();
			System.out.println("user deleted along with phones");
		} catch (Exception e) {
			tx.rollback();
			System.out.println("operation fail");
			e.printStackTrace();
		}

	}

}
