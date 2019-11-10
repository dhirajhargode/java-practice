package com.mc.ba.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mc.ba.beans.Monitor;
import com.mc.ba.beans.StmtGenerator;

public class TestMethodCallCount {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/mc/ba/cfg/application-Context.xml");
		StmtGenerator sg = context.getBean("sg", StmtGenerator.class);

		sg.generateStmt();
		sg.generateStmt();
		sg.generateStmt();

		System.out.println("Count : " + Monitor.getAccessCount("generateStmt"));

	}

}
