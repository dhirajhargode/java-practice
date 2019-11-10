package com.operator.id;

public class Test1 {

public static void main(String[] args) {
	
	int x=4;  
	int y=x++;			 //cant apply for final variable 
	System.out.println(y);
	int y1=x+1; 			// typcasting 
	
	
	System.out.println(y1);
	int z=++x;			 //cant apply for final variable 
	System.out.println(z);
	
	int b=x--;			 //cant apply for final variable  and boolean type variable
	System.out.println(b);
	int c=--x;			 //cant apply for final variable 
	System.out.println(c);
	
	System.out.println(0.0/0.0);		//NaN
	System.out.println(-0.0/0.0);		//NaN
//	System.out.println(0/0);  //throws arithmetic exception
	
	System.out.println(10>=10);
	System.out.println(10>10);
	System.out.println(10>=10.5);
	System.out.println(10<=10.5);
	
	System.out.println("Equality operator");
	System.out.println(10==10);
	System.out.println('a'==97.0);
	System.out.println('a'=='b');
	System.out.println(false==false);
	System.out.println(false==true);
	

	System.out.println("unEquality operator");
	System.out.println(10!=10);
	System.out.println('a'!=97.0);
	System.out.println('a'!='b');
	System.out.println(false!=false);
	System.out.println(false!=true);

	System.out.println("Bitwise");
	System.out.println(21^24);
	System.out.println("\n");
	System.out.println(!false);
	
	int d=-3>>>2;
	System.out.println(d);
}	


}
