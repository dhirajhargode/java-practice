package com.sdp.test;

import com.dhiraj.spring.CallMechanic;
import com.dhiraj.spring.Car;
import com.dhiraj.spring.NoFuel;
import com.dhiraj.spring.StartEngine;
import com.dhiraj.spring.StartEngineAgain;

public class Test {

	public static void main(String[] args) {
		
		StartEngine e=new StartEngine();
		Car c= new Car(e);
		c.Vehicle();
	
		NoFuel e2=new NoFuel();
		Car c1= new Car(e2);
		c1.Vehicle();

		CallMechanic e3=new CallMechanic();
		Car c2= new Car(e3);
		c2.Vehicle();
	
		StartEngineAgain e4=new StartEngineAgain();
		Car c3= new Car(e4);
		c3.Vehicle();
	
	
	}
}
