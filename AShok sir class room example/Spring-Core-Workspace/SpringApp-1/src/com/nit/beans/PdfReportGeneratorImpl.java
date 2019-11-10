package com.nit.beans;

public class PdfReportGeneratorImpl implements IReportGenerator {

	public PdfReportGeneratorImpl() {
		System.out.println("Pdf:0 param constructor");
	}

	public void generate() {
		// business logic
		System.out.println("Pdf Report generated...!");
	}

}
