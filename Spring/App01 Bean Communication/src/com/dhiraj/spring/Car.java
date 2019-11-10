package com.dhiraj.spring;

public class Car // extend Engine							// inheritance
{
	private IEngine engine;

	public Car(IEngine eng) {
		this.engine = eng;
	}

	public void Vehicle() {
		// Engine e=new Engine();               			// composition
		engine.Start();
	}

	@Override
	public String toString() {
		return "Car [engine=" + engine + "]";
	}
	
}
