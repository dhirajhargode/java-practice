package com.mr.beans;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.beans.factory.support.MethodReplacer;

public class ReportGeneratorReplacer implements MethodReplacer {

	@Override
	public Object reimplement(Object obj, Method m, Object[] args) throws Throwable {
		System.out.println(obj);
		if (m.getName().equals("generate")) {
			System.out.println("Using aspose api");
			System.out.println("Report generated...");
		}
		return obj;
	}
}
