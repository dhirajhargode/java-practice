package com.sarang.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.sarang.domain.JobType;
import com.sarang.domain.Person;
import com.sarang.utility.HibernateUtil;

public class selectOpration {
	public static void main(String[] args) {

		Session session = HibernateUtil.getInstance();
		/*
		 * Query query = session.createQuery("from Person"); List<Person> list1 =
		 * query.list();
		 * 
		 * for (Person per : list1) { System.out.println(per.getPid() + " " +
		 * per.getPname()); JobType job = per.getPjob(); System.out.println(job.getJob()
		 * + " " + job.getDepartment()); }
		 */
		Query query1 = session.createQuery("from Person where pjob.department=:det");
		query1.setParameter("det", "HR");
		List<Person> list11 = query1.list();
		for (Person per : list11) {
			System.out.println(per.getPid() + " " + per.getPname());
			JobType jb = per.getPjob();
			System.out.println(jb.getJob() + " " + jb.getDepartment());
		}

	}
}