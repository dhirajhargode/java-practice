package com.fm.test;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.fm.beans.SecurityService;

public class FMTest {
	static Scanner sc = new Scanner(System.in);	
	
	public static void main(String[] args) throws Exception{
		
		BeanFactory f=new XmlBeanFactory(new ClassPathResource("com/fm/cfg/application-Context.xml"));
		SecurityService ss = f.getBean("ss",SecurityService.class);
		System.out.println("Enter Password");
		String s=sc.next();
		String encpsw =ss.encrypt(s);
		System.out.println("Encrypt PassWord is :: "+ encpsw);
		String decpsw =ss.decrypt(encpsw);
		System.out.println("Decrypt PassWord is :: "+ decpsw);

	
	}

}
