package com.sarang.test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.sarang.domain.Phone;
import com.sarang.domain.User;
import com.sarang.utility.HibernateUtil;

public class Load_test {
	public static void main(String[] args) {
		Session session = HibernateUtil.getInstance();
		User user = new User();
		List<User> userlist = null;
		// Phone phone = new Phone();
		Query query = session.createQuery("from User");
		userlist = query.list();
		userlist.forEach(ul -> {
			System.out.print(ul.getUserid() + " " + ul.getName() + " ");

			List<Phone> phonelist = ul.getPhones();

			phonelist.forEach(fl -> {
				System.out.print(fl.getPhno() + " " + fl.getType());

			});

			System.out.println();

		});

	}
}
