package com.dhiraj;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo1 {
	public static void main(String[] args) throws IOException {
		FileWriter fr=new FileWriter("dhiru.txt");
		PrintWriter pw=new PrintWriter(fr);
		
		pw.write(100);
		pw.println(100);
		pw.println(true);
		pw.println('c');
		pw.print("dhiraj");
		
		pw.flush();
		pw.close();
				
	}
}
/*
o/p :						d100
						true
						c
						dhiraj
*/