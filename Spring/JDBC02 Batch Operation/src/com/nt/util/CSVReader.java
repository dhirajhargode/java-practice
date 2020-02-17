package com.nt.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.nt.model.EmployeeBO;

public class CSVReader {

	public List<EmployeeBO> readData() throws Exception {

		List<EmployeeBO> listemp = new ArrayList<>();

		String path = "EmployeeData.csv";

		FileReader fr = new FileReader(path);
		BufferedReader br = new BufferedReader(fr);

		String line = br.readLine();
		while (line != null) {

			String[] token = line.split(",");
			EmployeeBO emp = new EmployeeBO();

			emp.setEno(Integer.parseInt(token[0]));
			emp.setName(token[1]);
			emp.setJob(token[2]);
			emp.setSalary(Double.parseDouble(token[3]));

			listemp.add(emp);
			line = br.readLine();

		}

		return listemp;

	}

}