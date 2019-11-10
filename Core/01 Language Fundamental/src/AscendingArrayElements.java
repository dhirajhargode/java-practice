package com.company.module.submodule;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
//using set collection
public class AscendingArrayElements {
	/* static Set<Integer> s= new TreeSet<>();
	public static void main(String[] args) {
		ascendingElements(ip);
	}
	private static void ascendingElements(int[] ip2) {
		for(int i:ip) 
			s.add(i);
		System.out.println(s);
	}*/
	static int ip[] = {10, 5, 30, 40, 2, 4, 9};
	public static void main(String[] args) {
		/*
		 * Max two no:code
		 * int first=0;
		int second=0;
		int n=0;
		for(int i:ip) {
			if(first<i) {
				second=first;

				first=i;
			}
			else if(second<i) {
				second=i;
			}
		}
		System.out.println(first);
		System.out.println(second);
*/	
		int n=0;
		for(int i=0;i<ip.length;i++) {
			for(int j=i+1;j<ip.length;j++) {
				if(ip[i]>ip[j]) {
					n=ip[i];
					ip[i]=ip[j];
					ip[j]=n;
				}
			}
		}
		System.out.println(Arrays.toString(ip));
	
	}
	
}
