package com.sarang.test;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sarang.domain.Phone;
import com.sarang.domain.User;
import com.sarang.utility.HibernateUtil;

public class add_new_no_to_ueser {
	public static void main(String[] args) {
		Session session = HibernateUtil.getInstance();
		User user = new User();
		Phone ph = new Phone();
		Transaction tx = null;
		Map<String, Phone> phones = new HashMap<>();
		user = session.get(User.class, 1);
		phones = user.getPhones();
		ph.setPhno(0000);
		ph.setType("personal");
		try {
			tx = session.beginTransaction();
			phones.put("number-3", ph);
			tx.commit();
			System.out.println("new number added to user");
		} catch (Exception e) {
			System.out.println("error has come");
			tx.rollback();
			e.printStackTrace();
		}

	}
}
