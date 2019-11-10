package com.company.module.submodule;

public class EachDigitTotal {

	public static void main(String[] args) {
    System.out.println(total(256));
	}

	private static int total(int i) {
		int sum=0;
		
     		if(i==0) {
     			return 0;
     		}
     		else {
     			sum+=i%10;
     			i=i/10;
     			total(i);
     		}
     		return sum;
	}

}
