package com.sarang.test;

import com.sarang.dao.DaoFactory;
import com.sarang.dao.EmployeeDao;

public class test {
	public static void main(String[] args) {
		EmployeeDao dao = DaoFactory.getDao();
		dao.insertEmpDetail(54);
		dao.deleteEmpDetail(1);
		dao.updateEmpDetail(2);
	}

}
