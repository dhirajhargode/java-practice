package com.sarang.test;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sarang.domain.Phone;
import com.sarang.domain.User;
import com.sarang.utility.HibernateUtil;

public class insert_test {
	public static void main(String[] args) {
		Session session = HibernateUtil.getInstance();
		User user, user1 = null;
		Transaction tx = null;
		Phone ph, ph1, ph3, ph4 = null;
		Map<String, Phone> phones = new HashMap<>();
		Map<String, Phone> phones1 = new HashMap<>();

		// create first user
		user = new User();
		user.setUserid(1);
		user.setUsername("sarang");

		// first phone for first user

		ph = new Phone();
		ph.setPhno(123);
		ph.setType("private");

		// add 2nd phone to first user

		ph1 = new Phone();
		ph1.setPhno(124);
		ph1.setType("personal");

		// add both phones to map

		phones.put("number-1", ph);
		phones.put("number-2", ph1);

		// add map to user

		user.setPhones(phones);

		// create second user
		user1 = new User();
		user1.setUserid(2);
		user1.setUsername("kaashvi");

		// add 1st phone to user
		ph3 = new Phone();
		ph3.setPhno(125);
		ph3.setType("personal");

		// add 2nd phone to user
		ph4 = new Phone();
		ph4.setPhno(126);
		ph4.setType("office");

		// add both phone to map
		phones1.put("number-1", ph3);
		phones1.put("number-2", ph4);
		user1.setPhones(phones1);
		try {
			tx = session.beginTransaction();
			session.save(user);
			session.save(user1);
			tx.commit();
			System.out.println("record saved");

		} catch (Exception e) {
			tx.commit();
			System.out.println("failed to insert ");
			e.printStackTrace();
		}
	}

}
