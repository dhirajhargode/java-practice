package com.sc.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import com.sc.bo.EmployeeBO;

public class EmployeeDAO {

	private SimpleJdbcCall simplecall;

	public EmployeeBO getEmpDetail(int id) {
		simplecall.setProcedureName("getDetails");
		Map<String, Object> inparam = new HashMap<String, Object>();
		inparam.put("no", id);

		Map<String, Object> outparam = simplecall.execute(inparam);
		EmployeeBO e = new EmployeeBO(id, (String) outparam.get("NAME"), (String) outparam.get("Job"),
				(Double) outparam.get("Salary"));
		return e;

	}

	public SimpleJdbcCall getSimplecall() {
		return simplecall;
	}

	public void setSimplecall(SimpleJdbcCall simplecall) {
		this.simplecall = simplecall;
	}

}