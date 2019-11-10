package com.test;

import java.io.File;
import java.util.Scanner;

public class SeatAllocationTest {

	public static void main(String[] args) {
		String filepath = "src/candidatelist.csv";
		
		File file = new File(filepath);
		
		try {
			Scanner sc = new Scanner(System.in);
			while (sc.hasNext()) {
				String data = sc.next();
				System.out.println(data);
			}
			
			sc.close();
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
