package com.sarang.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sarang.domain.User;
import com.sarang.utility.HibernateUtil;

public class delete_User {
	public static void main(String[] args) {
		Session session = HibernateUtil.getInstance();
		User user=new User();
		Transaction tx=null;
		
		user=session.get(User.class,2);
		try {
			tx=session.beginTransaction();
			session.delete(user);
			tx.commit();
			System.out.println("user deleted along with phone no");
			
		}catch(Exception e) {
			tx.rollback();
			System.out.println("error has come");
			e.printStackTrace();
		}
	}

}
