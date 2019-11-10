package com.sarang.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sarang.domain.Phone;
import com.sarang.domain.User;
import com.sarang.utility.HibernateUtil;

public class delete_all_phone_Number_of_User {
	public static void main(String[] args) {
		Session session = HibernateUtil.getInstance();
		Transaction tx = null;
		Set<Phone> phones = new HashSet<>();
		User user = session.get(User.class, 1);
		phones = user.getPhones();
		try {
			tx = session.beginTransaction();
			phones.clear();
			tx.commit();
			System.out.println("all phone number of user is deleted");

		} catch (Exception e) {
			System.out.println("delete operation is  failed");
			tx.rollback();
			e.printStackTrace();

		}
	}

}
