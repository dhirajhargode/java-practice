package com.company.module.submodule;

public class StringReverse {
String s="Nov";
String reverse="";

	public static void main(String[] args) {
StringReverse sr=new StringReverse();
 String s1= sr.reverseIt(sr.s.length());
 System.out.println(s1);
	}
public String reverseIt(int i) {

	while(i!=0) {
	reverse=reverse+s.charAt(i-1);
	i--;
	reverseIt(i);
	break;
	}
	return reverse;
	
}
}
