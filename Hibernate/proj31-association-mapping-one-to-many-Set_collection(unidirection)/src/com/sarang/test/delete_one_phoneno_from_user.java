package com.sarang.test;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sarang.domain.Phone;
import com.sarang.domain.User;
import com.sarang.utility.HibernateUtil;

public class delete_one_phoneno_from_user {
	public static void main(String[] args) {
		Session session = HibernateUtil.getInstance();
		Transaction tx = null;
		User user = session.get(User.class, 2);
		Set<Phone> phones = user.getPhones();
		Phone ph = session.get(Phone.class, 12347);
		try {
			tx = session.beginTransaction();
			phones.remove(ph);
			tx.commit();
			System.out.println("one number deleted");
		} catch (Exception e) {
			tx.rollback();
			System.out.println("object deleted");
			e.printStackTrace();
		}

	}

}
