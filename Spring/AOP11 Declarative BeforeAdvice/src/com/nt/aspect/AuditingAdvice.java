package com.nt.aspect;

import java.io.FileWriter;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Date;

import org.springframework.aop.MethodBeforeAdvice;

public class AuditingAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method m, Object[] arg, Object t) throws Throwable {
		System.out.println("Target class name ::" + t.getClass());
		System.out.println("Target Method name :: " + m.getName());
		System.out.println("Argument ::" + Arrays.toString(arg));
		if ((Integer) arg[0] == 0) {
			throw new IllegalArgumentException("Wrong order ID ");

		}
		if ((Integer) arg[0] < 0) {
			arg[0] = ((Integer) arg[0]) * -1;

		}

		// auditing
		FileWriter fw = new FileWriter("E:\\JAVA\\auditlog.txt", true);
		fw.write(arg[0] + "order has come for approval at " + new Date() + "\n");
		fw.flush();
		fw.close();
	}

}
