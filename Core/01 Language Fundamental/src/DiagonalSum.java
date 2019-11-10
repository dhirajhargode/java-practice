package com.company.module.submodule;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
//wrong code
public class DiagonalSum {
	static int diagonalDifference(int[][] a) {
		int msum = 0;
		int lsum = 0;
		int k=a.length;
		int temp=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (i == j) {
					msum = msum + a[i][j];
					if(k%2!=0) {
					if(k==3&&!(temp>0)&&i==1&&j==1) {
						lsum=lsum+a[i][j];
						temp++;
					}
					else {
						lsum=lsum+a[i][j];
					}
					}
				}
				else if ((i == 0 & j == k-1) || (i == k-1 & j == 0)||(i==j+1)||(j==i+1)) 
						lsum = lsum + a[i][j];
				
			}
				
		}
		System.out.println(msum);
		System.out.println(lsum);
		 int result=msum-lsum;

		 return (result>0)?result:result*(-1);
		}
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] a = new int[n][n];
		for (int a_i = 0; a_i < n; a_i++) {
			for (int a_j = 0; a_j < n; a_j++) {
				a[a_i][a_j] = in.nextInt();
			}
		}
		int result = diagonalDifference(a);
		System.out.println(result);
		in.close();
	}

}
