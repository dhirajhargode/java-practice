package com.dhiraj.servlet;

import java.io.File;

public class FileDemoListOfIsDirectory {

	public static void main(String[] args) {
		int count = 0;
		File f = new File("E:\\");
		String[] s = f.list();
		for (String s1 : s) {
			File f2 = new File(f, s1);
			if (f2.isDirectory()) {

				count++;
				System.out.print(s1);
			}
			System.out.println("   total number " + count);
		}
	}

}
