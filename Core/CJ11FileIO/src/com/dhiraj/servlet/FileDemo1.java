package com.dhiraj.servlet;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {
	public static void main(String[] args) throws IOException {
		File f=new File("abc.txt");						// import io.file	
		System.out.println(f.exists());
		f.createNewFile();								// throw io exception
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