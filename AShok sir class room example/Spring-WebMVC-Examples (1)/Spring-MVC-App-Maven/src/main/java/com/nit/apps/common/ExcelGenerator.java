package com.nit.apps.common;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsView;

import com.nit.apps.model.Product;

public class ExcelGenerator extends AbstractXlsView {

	@Override
	protected void buildExcelDocument(Map<String, Object> model,
			Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		List<Product> pList = (List<Product>) model.get("pList");

		Sheet sheet = workbook.createSheet("Products Data");
		
		sheet.setDefaultColumnWidth(20);

		Row header = sheet.createRow(0);
		header.createCell(0).setCellValue("Product ID");
		header.createCell(1).setCellValue("Product Name");
		header.createCell(2).setCellValue("Product Price");
		int i = 1;
		for (Product p : pList) {
			Row dataRow = sheet.createRow(i++);
			dataRow.createCell(0).setCellValue(p.getPid());
			dataRow.createCell(1).setCellValue(p.getPname());
			dataRow.createCell(2).setCellValue(p.getPrice());
		}
	}
}
