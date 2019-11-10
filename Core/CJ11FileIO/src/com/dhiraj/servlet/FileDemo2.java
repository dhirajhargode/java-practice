package com.dhiraj.servlet;

import java.io.File;

public class FileDemo2 {

	public static void main(String[] args) {
		File f=new File("Dhiraj");							// dhiraj directory
		System.out.println(f.exists());
		f.mkdir();
		System.out.println(f.exists());
		
	}
}

/*
1 run
false
true


2nd run
true
true



*/