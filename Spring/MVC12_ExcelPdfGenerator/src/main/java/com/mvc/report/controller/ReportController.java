package com.mvc.report.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mvc.report.model.Product;

@Controller
public class ReportController {

	@RequestMapping("/excel")
	public ModelAndView generateExcel() {
		List<Product> pList = getProductsData();
		return new ModelAndView("excelView", "products", pList);
	}

	@RequestMapping("/pdf")
	public ModelAndView generatePdf() {
		List<Product> pList = getProductsData();
		return new ModelAndView("pdfView", "products", pList);
	}

	private List<Product> getProductsData() {
		List<Product> plist = new ArrayList<Product>();
		plist.add(new Product(101, "Keyboard"));
		plist.add(new Product(102, "MousePad"));
		plist.add(new Product(103, "Mouse"));
		plist.add(new Product(104, "Battery"));
		return plist;
	}
}