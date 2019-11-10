package com.company.module.submodule;

public class StringNInteger {

	public static void main(String[] args) {
Object[] arr= {"a","b",5,"c",7,8,"d",8};
int n=0;
int sum=0;

for(Object o:arr) {
	if(o instanceof Integer) {
		n++;
	sum=sum+(Integer)o;	
	}
}
System.out.println("Average:"+(double)sum/n);
	}

}