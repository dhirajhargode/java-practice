package com.sarang.test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sarang.domain.Phone;
import com.sarang.domain.User;
import com.sarang.utility.HibernateUtil;

public class add_new_child_to_Parent {
	public static void main(String[] args) {
		Session session = HibernateUtil.getInstance();
		User user = new User();
		Phone phone = new Phone();
		List<Phone> phones = new ArrayList();
		Transaction tx = null;
		user = session.get(User.class, 1);
		phones = user.getPhones();
		phone.setPhno(54321);
		phone.setType("secreate");
		phones.add(phone);
		user.setPhones(phones);
		try {
			tx = session.beginTransaction();
			session.save(user);
			tx.commit();
			System.out.println("new number added");

		} catch (Exception e) {
			tx.rollback();
			System.out.println("new no not added");
			e.printStackTrace();

		}

	}

}
