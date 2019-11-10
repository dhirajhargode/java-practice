package com.sarang.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sarang.domain.Phone;
import com.sarang.domain.User;
import com.sarang.utility.HibernateUtil;

public class delete_one_phone_from_user {
	public static void main(String[] args) {
		Session session = HibernateUtil.getInstance();
		User user = new User();
		Transaction tx = null;
		List<Phone> phonelist = null;
		user = session.get(User.class, 1);
		phonelist = user.getPhones();
		phonelist.remove(0);
		user.setPhones(phonelist);
		try {
			tx = session.beginTransaction();
			session.save(user);
			tx.commit();
			System.out.println("one number deleted from user");

		} catch (Exception e) {
			tx.rollback();
			System.out.println("operation failed");
			e.printStackTrace();
		}

	}
}
