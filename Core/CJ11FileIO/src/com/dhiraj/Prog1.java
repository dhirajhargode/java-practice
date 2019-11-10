package com.dhiraj;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Prog1 {
	
	public static void main(String[] args) throws IOException {
		
		PrintWriter pw=new PrintWriter("file3.txt");
		BufferedReader br=new BufferedReader(new FileReader("file1.txt"));
		String l=br.readLine();
		
		while(l!=null)
		{
			pw.print(l);
			l=br.readLine();
		}

		br=new BufferedReader(new FileReader("file2.txt"));
		l=br.readLine();
		while(l!=null)
		{
			pw.print(l);
			l=br.readLine();
		}
	
			pw.close();
			br.close();
			pw.close();
	}
	
}
