package com.dhiraj.servlet;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo1 {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("abc5.txt");
		//fw.write(int ch)
		fw.write(100);
		fw.write("hiraj\nhargode");
		
		fw.write('\n');           // varried from system to system  BufferedWriter and printwriter classes 
		fw.write("\n"); 
		//fw.write('a');
		
		//fw.write(char[] ch)
		char[] ch= {'a','b','c'};
		fw.write(ch);
		
		//fw.write(String s)
		//fw.write(" Dhiraj \n hargode ");
		
		fw.flush();
		fw.close();
	}
}
