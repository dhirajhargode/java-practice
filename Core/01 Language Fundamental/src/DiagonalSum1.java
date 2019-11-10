package com.company.module.submodule;

import java.util.Scanner;

public class DiagonalSum1 {
	 static int diagonalDifference(int[][] a) {
	        int msum=0;
	        int lsum=0;
	        int k=a.length;
		    for(int i=0;i<a.length;i++){
		        for(int j=0;j<a.length;j++){
		        	if(i==j) {
		        		msum=msum+a[i][j];
		        		if(k%2!=0) {
		        			if((k-i==i+1)&&(i==j))
		        			lsum=lsum+a[i][j];
		        		}
		        	}
		        	else if(i+j==k-1)
		        		lsum=lsum+a[i][j];
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
		        for(int a_i = 0; a_i < n; a_i++){
		            for(int a_j = 0; a_j < n; a_j++){
		                a[a_i][a_j] = in.nextInt();
		            }
		        }
		        int result = diagonalDifference(a);
		        System.out.println(result);
		        in.close();
		    }
}
