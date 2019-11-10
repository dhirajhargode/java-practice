package com.dhiraj.servlet;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BRDemo1 {
	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("xyz.txt");
		BufferedReader br=new BufferedReader(fr);
		
		int r=br.read();
		System.out.println((char)r);
		
		char[] ch=new char[10];
		System.out.println(ch);
		
		String l=br.readLine();
		while(l!=null)
		{
			System.out.println(l);
			l=br.readLine();
		}
		br.close();
	}
}
