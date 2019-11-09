package com.sla.service;

import com.sla.bo.StudentBO;
import com.sla.dao.StudentDAOImpl;
import com.sla.dto.StudentDTO;

public class StudentServiceImpl implements StudentService {
	private int total = 0;
	private float avg = 0.0f;
	private String result = null;

	@Override
	public String generateResult(StudentDTO dto) throws Exception {

		total = dto.getM1() + dto.getM2() + dto.getM3();
		avg = total / 3.0f;

		if (avg >= 35 && dto.getM1() >= 35 && dto.getM2() >= 35 && dto.getM3() >= 35)
			result = "Pass";
		else
			result = "Fail";

		StudentBO bo = new StudentBO();
		bo.setSno(dto.getSno());
		bo.setSname(dto.getSname());
		bo.setTotal(total);
		bo.setAvg(avg);
		bo.setResult(result);

		StudentDAOImpl dao = new StudentDAOImpl();
		int count = dao.insert(bo);
		if (count == 0)
			return "Registration fail";
		else
			return "Registation Suceeded And Result " + result;

	}

}
