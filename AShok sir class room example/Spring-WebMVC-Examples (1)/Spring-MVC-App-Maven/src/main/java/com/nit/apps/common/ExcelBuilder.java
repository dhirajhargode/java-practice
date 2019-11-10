package com.nit.apps.common;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsView;

import com.nit.apps.model.Product;

public class ExcelBuilder extends AbstractXlsView {

	@SuppressWarnings("unchecked")
	@Override
	protected void buildExcelDocument(Map<String, Object> model,Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		response.setHeader("Content-Disposition","attachment;filename=Data.xls");
		
		
		List<Product> pList = (List<Product>)model.get("pList");
		
		
		Sheet sheet = workbook.createSheet("Products Data");
		sheet.setDefaultColumnWidth(10);
		Row header = sheet.createRow(0);
		
		header.createCell(0).setCellValue("Product Id");
		header.createCell(1).setCellValue("Product Name");
		header.createCell(2).setCellValue("Product Price");

		int rowNum = 1;
		for (Product p : pList) {
			Row row = sheet.createRow(rowNum++);
			row.createCell(0).setCellValue(p.getPid());
			row.createCell(1).setCellValue(p.getPname());
			row.createCell(2).setCellValue(p.getPrice());
		}
	}
}
