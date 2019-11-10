package com.dhiraj.servlet;

import java.io.File;
import java.util.concurrent.CountDownLatch;

public class FileDemoListOfDir {
	public static void main(String[] args) {
		int count =0;
		File f=new File("E:\\Dhiraj");
		String[] s=f.list();
		for(String s1:s)
		{
			count++;
			System.out.println(s1);
		}
		System.out.println(count);
		
	}
}
