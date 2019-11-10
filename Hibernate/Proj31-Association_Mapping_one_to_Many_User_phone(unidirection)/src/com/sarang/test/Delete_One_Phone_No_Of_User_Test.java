package com.sarang.test;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sarang.domain.PhoneNo;
import com.sarang.domain.User;
import com.sarang.utility.HibernateUtil;

public class Delete_One_Phone_No_Of_User_Test {

	public static void main(String[] args) {
		Session session = HibernateUtil.getInstance();
		User user = null;
		Transaction tx = null;

		user = session.get(User.class, "1");
		Set<PhoneNo> phone = user.getPhone();
		
		try {
			tx = session.beginTransaction();
			phone.clear();
			tx.commit();
			System.out.println("all phone no deleted successfully");
		} catch (Exception e) {
			System.out.println("phone no is not deleted");
			e.printStackTrace();
		}

	}
}
