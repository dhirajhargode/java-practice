package com.sarang.test;

import java.util.Map;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sarang.domain.Phone;
import com.sarang.domain.User;
import com.sarang.utility.HibernateUtil;

public class delete_one_phone_from_user {
	public static void main(String[] args) {
		Session session = HibernateUtil.getInstance();
		User user = null;
		Map<String, Phone> phones = null;
		Transaction tx = null;
		user = session.get(User.class, 1);
		phones = user.getPhones();
		try {
			tx = session.beginTransaction();
			phones.remove("number-2");
			tx.commit();
			System.out.println("objevt removed");
		} catch (Exception e) {
			tx.rollback();
			System.out.println("error has come");
			e.printStackTrace();

		}

	}

}
