package com.nit.beans;

public class ReportContext {

	IReportGenerator irg = null;

	public ReportContext(IReportGenerator irg) {
		this.irg = irg;
		System.out.println("ReportContext:0-param constructor");
	}

	public void generateReport() throws Exception {
		irg.generate();
	}
}
