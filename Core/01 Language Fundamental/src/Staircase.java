package com.company.module.submodule;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Staircase {

	static void staircase(int n) {
		
		for(int i=0;i<n;i++) {
			for(int j=i;j<n-1;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print("#");
			}
			System.out.println();
		}

		/*for (int i = n; i>0; i--) {
			for(int j=1;j<i;j++) {
			System.out.print(" ");
			}
           for(int k=0;k<=n-i;k++) {
        	   System.out.print("#");
           }
           System.out.println();
		}
		*/
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		staircase(n);
		in.close();
	}
}
