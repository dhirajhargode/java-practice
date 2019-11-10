package com.sarang.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sarang.domain.User;
import com.sarang.utility.HibernateUtil;

public class Delete_User_Phone_No {
	public static void main(String[] args) {
		Session session = HibernateUtil.getInstance();
		Transaction tx = null;
		User user = session.get(User.class, 2);
		try {
			tx = session.beginTransaction();
			session.delete(user);
			tx.commit();
			System.out.println("object deleted");

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("object not deleted");
			e.printStackTrace();
		}
	}
}
