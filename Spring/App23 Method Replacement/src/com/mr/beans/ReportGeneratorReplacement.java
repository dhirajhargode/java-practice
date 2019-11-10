package com.mr.beans;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class ReportGeneratorReplacement implements MethodReplacer {

	@Override
	public Object reimplement(Object obj, Method m, Object[] arg) throws Throwable {
		
		if(m.getName().equals("generate")) {
			
			System.out.println("Report using aspose api");
			System.out.println("report generated..");
		}//if
		
		return null;
	}
	
	
	
	

}
