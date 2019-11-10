package com.sarang.test;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sarang.domain.PhoneNo;
import com.sarang.domain.User;
import com.sarang.utility.HibernateUtil;

public class Add_New_Phone_to_Existing_User_Test {

	// load user ,for which the new no is to be add
	public static void main(String[] args) {
		Session session = HibernateUtil.getInstance();
		User user = null;
		user = session.get(User.class, "1");
		Set<PhoneNo> phone = user.getPhone();

		// add new phone no to the Set<PhoneNo>
		PhoneNo ph = new PhoneNo();
		ph.setPhId("12211221");
		ph.setType("perpamant");
		try {
			Transaction tx = session.beginTransaction();
			phone.add(ph);
			tx.commit();
			System.out.println("new Phone number added");

		} catch (Exception e) {
			System.out.println("new phone no is not added");
			e.printStackTrace();
		}

	}

}
