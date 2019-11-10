package com.dhiraj.servlet;

/*
		boolean exists();
		boolean createNewFile();
		boolean mkdir();
		boolean isFile();
		boolean isDirectory();
		String[] list();							name of file in sub directory
		long length();								no of char present in file
		boolean delete();							delete file or directory
		
*/
import java.io.File;
import java.io.IOException;

public class FileDemo3 {

	public static void main(String[] args) throws IOException {
		File f1 = new File("MyNewFile1.txt");
		f1.createNewFile();

		File f3 = new File("Dhiraj1");
		f3.mkdir();
		
		File f2 = new File("Dhiraj1", "MyNewFile2.txt");
		f2.createNewFile();
		
		File f4 = new File("Dhiraj12");
		f4.mkdir();

		File f5 = new File(f4, "MyNewFile3.txt");
		f5.createNewFile();

		
	}
}
