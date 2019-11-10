
package com.test;
import java.util.Scanner;

import com.inventory.Computer;

class Test{

	private String manufactureName;
	private Integer ramSize;
	private Integer hdCapacity;

	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args){
		
		Test t = new Test();	
		Computer c = new Computer();
		c.add(t.userData());
		c.display();
		
	}

	public Computer userData(){
		System.out.print("Manufacture name :");
		manufactureName = sc.next();
		System.out.print("Ram Size :");
		ramSize = sc.nextInt();
		System.out.print("HD Capacity :");
		hdCapacity = sc.nextInt();
		return new Computer(manufactureName,ramSize,hdCapacity);
	}

}