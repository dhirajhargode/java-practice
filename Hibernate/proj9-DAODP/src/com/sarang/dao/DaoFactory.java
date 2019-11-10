package com.sarang.dao;

public class DaoFactory {
public static EmployeeDao getDao() {
	return new EmployeeDaoImpl();
}
}
