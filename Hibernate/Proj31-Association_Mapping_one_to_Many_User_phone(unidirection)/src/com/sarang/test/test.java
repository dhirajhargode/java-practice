package com.sarang.test;

import java.util.HashSet;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.sarang.domain.PhoneNo;
import com.sarang.domain.User;
import com.sarang.utility.HibernateUtil;

public class test {
	public static void main(String[] args) {
		Session session = HibernateUtil.getInstance();
		Transaction tx = session.beginTransaction();
		try {
			User user = new User();
			user.setUserId("232221");
			user.setFname("ram");
			PhoneNo number = new PhoneNo();
			number.setPhId("3313233");
			number.setType("personal");
			PhoneNo number2 = new PhoneNo();
			number2.setPhId("22");
			number2.setType("what's app");
			Set<PhoneNo> set = new HashSet();
			set.add(number);
			set.add(number2);
			user.setPhone(set);
			session.save(user);
			tx.commit();
			System.out.println("record inserted");

		} catch (Exception ex) {
			tx.rollback();
			System.out.println("record not inserted");
			ex.printStackTrace();

		}

	}

}
