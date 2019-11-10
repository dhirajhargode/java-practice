package com.nit.beans;

public class ExcelReportGeneratorImpl implements IReportGenerator {

	public ExcelReportGeneratorImpl() {
		System.out.println("Excel :0 param constructor");
	}

	public void generate() {
		// business logic
		System.out.println("Excel Report generated...!");
	}

}
