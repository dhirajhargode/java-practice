package com.ta.test;

import org.springframework.aop.framework.ProxyFactory;

import com.ta.beans.DepartDao;
import com.ta.beans.ExceptionLogger;

public class TestThrowsAdvice {

	public static void main(String[] args) {

		ProxyFactory factory = new ProxyFactory();
		factory.setTarget(new DepartDao());
		factory.addAdvice(new ExceptionLogger());

		DepartDao dao = (DepartDao) factory.getProxy();
		dao.insert();

	}

}
