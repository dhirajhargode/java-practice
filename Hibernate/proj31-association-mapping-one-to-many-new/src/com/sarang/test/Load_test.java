package com.sarang.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.sarang.domain.Phone;
import com.sarang.domain.User;
import com.sarang.utility.HibernateUtil;

public class Load_test {
	public static void main(String[] args) {

		Session session = HibernateUtil.getInstance();
		Query query = null;
		List<User> userlist = new ArrayList<>();

		query = session.createQuery("from User");
		userlist = query.list();
		userlist.forEach(ul -> {
			Set<Phone> phones = new HashSet<>();
			System.out.print(ul.getUserid() + " " + ul.getUname());
			phones = ul.getPhones();
			System.out.println(phones.size()+"===================");
			/*
			 * phones.forEach(ph -> { System.out.println(ph.getPhno() + " " + ph.getType());
			 * 
			 * });
			 */

		});
	}

}
