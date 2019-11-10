package com.ta.test;

import org.springframework.aop.framework.ProxyFactory;

import com.ta.beans.DeptDao;
import com.ta.beans.LogAdvice;

public class TestThrowsAdvice {

	public static void main(String[] args) {

		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(new DeptDao());
		pf.addAdvice(new LogAdvice());

		DeptDao d = (DeptDao) pf.getProxy();
		d.insert();
	}

}
