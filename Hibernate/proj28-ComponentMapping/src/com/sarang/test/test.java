package com.sarang.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sarang.domain.JobType;
import com.sarang.domain.Person;
import com.sarang.utility.HibernateUtil;

public class test {
	public static void main(String[] args) {
		Session session = null;
		Transaction tx = null;

		session = HibernateUtil.getInstance();
		JobType job = new JobType();
		job.setJob("cleark");
		job.setDepartment("HR");

		Person persion = new Person();
		persion.setPid(2);
		persion.setPname("saramg");
		persion.setPjob(job);
		try {

			tx = session.beginTransaction();
			session.save(persion);
			tx.commit();
			System.out.println(" object is inserted  ");

		} catch (Exception e) {
			tx.rollback();
			System.out.println("object is not inserted");
		}

	}

}
