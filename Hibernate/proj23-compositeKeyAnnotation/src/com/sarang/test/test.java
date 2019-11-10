package com.sarang.test;

import org.hibernate.Session;

import org.hibernate.Transaction;

import com.sarang.domain.Composite;
import com.sarang.domain.employeeComposit;
import com.sarang.util.Util;

public class test {
	public static void main(String[] args) {
		Session session = null;
		employeeComposit ec = null;
		Composite cm = new Composite();

		cm.setPrgm_id(4);
		cm.setProj_id(40);
		ec = new employeeComposit();
		ec.setId(cm);
		ec.setPrgmName("sarang");
		ec.setProjName("banking");
		ec.setSalary(120000);
		session = Util.getSession();
		try {
			Transaction tx = session.beginTransaction();
			cm = (Composite) session.save(ec);
			tx.commit();
			System.out.println("object inserted");
			System.out.println(cm);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("object not inserted");

		}

	}
}
