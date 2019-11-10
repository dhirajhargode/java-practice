package com.sarang.test;

import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.sarang.domain.Phone;
import com.sarang.domain.User;
import com.sarang.utility.HibernateUtil;

public class load_test {
	public static void main(String[] args) {
		Session session = HibernateUtil.getInstance();
		List<User> users = null;
		Query query = null;
		query = session.createQuery("from User");
		users = query.list();
		users.forEach(u -> {
			System.out.print(u.getUserid() + " " + u.getUsername());
			Map<String, Phone> phones = u.getPhones();

		});

	}

}
