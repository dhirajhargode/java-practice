package com.sarang.test;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;
import com.sarang.utility.HibernateUtil;

public class Load_data_using_user {

	public static void main(String[] args) {
		Session session = HibernateUtil.getInstance();
		Query query = null;
		List<Object[]> objectlist = null;
		query = session.createQuery("select u.userid,u.uname,ph.phno,ph.type from User u inner join u.phones ph");

		// execute query
		objectlist = query.list();
		for (Object[] row : objectlist) {
			System.out.println(row.getClass().getName());
			System.out.println(row.length);
			for (Object val : row) {
				System.out.println(val.getClass().getName());
				System.out.print(val + " ");

			}

			System.out.println();
		}

	}

}
