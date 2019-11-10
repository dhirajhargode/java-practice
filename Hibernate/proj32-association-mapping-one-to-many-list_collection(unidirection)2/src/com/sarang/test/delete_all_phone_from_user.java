package com.sarang.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sarang.domain.Phone;
import com.sarang.domain.User;
import com.sarang.utility.HibernateUtil;

public class delete_all_phone_from_user {
	public static void main(String[] args) {
		Session session = HibernateUtil.getInstance();
		List<Phone> phonelist;
		Transaction tx = null;

		User user = null;
		user = session.get(User.class, 1);
		phonelist = user.getPhones();
		try {
			tx = session.beginTransaction();
			phonelist.clear();
			tx.commit();
			System.out.println("phone no deleted");
		} catch (Exception e) {
			tx.rollback();
			System.out.println("operation failed");
			e.printStackTrace();
		}

	}

}
