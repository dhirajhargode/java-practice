package com.dhiraj.servlet;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterDemo1 {
	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("xyz.txt");		
		BufferedWriter bw=new BufferedWriter(new BufferedWriter(fw));
		bw.write(100);
		bw.write("hiraj");
		bw.newLine();
		char[] ch= {'a','b','c'};
		bw.write(ch);
	
		//bw.flush();
		bw.close();
	}

}
