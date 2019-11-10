package com.sarang.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sarang.domain.User;
import com.sarang.utility.HibernateUtil;

public class Delete_User_with_Phone_No {
	public static void main(String[] args) {
		Session session = null;
		User user = null;
		Transaction tx = null;

		session = HibernateUtil.getInstance();
		user = session.get(User.class, "2");
		try {
			tx = session.beginTransaction();
			session.delete(user);
			tx.commit();
			System.out.println("giver user deleted");

		} catch (Exception e) {
			System.out.println("user not deleted with phone no");
			e.printStackTrace();
		}
	}

}
