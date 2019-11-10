package com.sarang.test;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sarang.domain.Phone;
import com.sarang.domain.User;
import com.sarang.utility.HibernateUtil;

public class add_new_child_To_parent {
	public static void main(String[] args) {
		Session session = HibernateUtil.getInstance();
		Phone ph = new Phone();
		Transaction tx = null;
		ph.setPhno(98765);
		ph.setType("office");
		User user = session.get(User.class, 1);
		Set<Phone> phones = user.getPhones();
		phones.add(ph);
		try {
			tx = session.beginTransaction();
			session.save(user);
			tx.commit();
			System.out.println("new number is added to user");
		}

		catch (Exception e) {
			tx.rollback();
			System.out.println("failed");
			e.printStackTrace();

		}
	}

}
