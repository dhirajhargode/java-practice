package com.sarang.test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sarang.domain.Phone;
import com.sarang.domain.User;
import com.sarang.utility.HibernateUtil;

public class insert_test {
	public static void main(String[] args) {
		Session session = HibernateUtil.getInstance();
		Transaction tx = null;
		User user = new User();
		Phone phone = new Phone();
		List<Phone> phonelist = new ArrayList();
		user.setUserid(1);
		user.setName("prnad");
		phone.setPhno(123);
		phone.setType("private");
		Phone phone1 = new Phone();
		phone1.setPhno(124);
		phone1.setType("office");
		phonelist.add(phone);
		phonelist.add(phone1);
		user.setPhones(phonelist);

		// add second user
		User user1 = new User();
		user1.setUserid(2);
		user1.setName("kaashvi");
		Phone phone2 = new Phone();
		List<Phone> phonelist1 = new ArrayList<>();
		phone2.setPhno(1236);
		phone2.setType("office");

		Phone phone3 = new Phone();
		phone3.setPhno(1237);
		phone3.setType("private");
		phonelist1.add(phone2);
		phonelist1.add(phone3);
		user1.setPhones(phonelist1);

		try {
			tx = session.beginTransaction();
			session.save(user);
			session.save(user1);
			tx.commit();
			System.out.println("record saved");

		} catch (Exception e) {
			tx.rollback();
			System.out.println("failed");
			e.printStackTrace();
		}

	}

}
