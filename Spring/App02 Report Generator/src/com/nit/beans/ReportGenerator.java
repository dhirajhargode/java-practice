package com.nit.beans;

public class ReportGenerator {

	IReporrtGenerator irg;

	public void setIrg(IReporrtGenerator irg) {
		this.irg = irg;
	}

	public void generateReport() {
		irg.generator();
	}

}
