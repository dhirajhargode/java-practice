package com.sarang.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sarang.domain.Phone;
import com.sarang.domain.User;
import com.sarang.utility.HibernateUtil;

public class Insert_test {
	public static void main(String[] args) {
		Session session = HibernateUtil.getInstance();
		Transaction tx = null;
		User user = new User();
		Phone phone = new Phone();
		Set<Phone> phones = new HashSet<>();
		user.setUserid(1);
		user.setUname("sarang");

		phone.setPhno(12345);
		phone.setType("personal");
		Phone phone1 = new Phone();
		phone1.setPhno(12346);
		phone1.setType("private");
		phones.add(phone);
		phones.add(phone1);
		user.setPhones(phones);

		// second user
		User user1 = new User();
		Phone phone3 = new Phone();
		user1.setUserid(2);
		user1.setUname("kaashvi");
		Set<Phone> phones1 = new HashSet();

		phone3.setPhno(12347);
		phone3.setType("personal");
		Phone phone4 = new Phone();
		phone4.setPhno(12348);
		phone4.setType("private");
		phones1.add(phone3);
		phones1.add(phone4);
		user1.setPhones(phones1);

		try {
			tx = session.beginTransaction();
			session.save(user);
			session.save(user1);
			tx.commit();
			System.out.println("object inserted");

		} catch (Exception e) {
			tx.rollback();
			System.out.println("object is not saved");
			e.printStackTrace();

		}

	}
}
