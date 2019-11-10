package com.sarang.test;

import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.sarang.domain.PhoneNo;
import com.sarang.domain.User;
import com.sarang.utility.HibernateUtil;

public class displayTest {
	public static void main(String[] args) {
		Session session = HibernateUtil.getInstance();

		Query query = null;
		List<User> userList = null;
		Set<PhoneNo> phoneSet = null;
		query = session.createQuery("from User");
		userList = query.list();
		System.out.println("sarang1");
		for (User us : userList) {
			System.out.println(us.getUserId() + " " + us.getFname());
			phoneSet = us.getPhone();
			for (PhoneNo ph : phoneSet) {
				System.out.println(ph.getPhId() + " " + ph.getType());

			}

		}

	}
}
