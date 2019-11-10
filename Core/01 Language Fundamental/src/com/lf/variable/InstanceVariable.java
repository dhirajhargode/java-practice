package com.lf.variable;

public class InstanceVariable {
	
	//instance variable with default value  
	private int i1;

	//instance variable with aasign value 
	private int i=10;
	
	//boolean with default value
	private boolean b;
	
	public static void main(String[] args) {
		
		InstanceVariable iv=new InstanceVariable();
		
		System.out.println(iv.i);  //10
		System.out.println(iv.i1); //0
		iv.i1=11;
		System.out.println(iv.i1); // 11
		System.out.println(iv.b);  // false
		
		//call instance method from static method
		iv.methodOne();
		
		
	}
	
	//instance method 
	public void methodOne() {
		// assign boolean b
		b=true;
		System.out.println("from m1 :: "+b);
	}

}
