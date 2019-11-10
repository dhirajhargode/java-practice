package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import com.nt.bo.EmpBO;
import com.nt.dao.ListEmpDAO;
import com.nt.dto.EmpDTO;

public class ListEmpService {

	private ListEmpDAO dao;

	public void setDao(ListEmpDAO dao) {
		this.dao = dao;
	}

	public List<EmpDTO> getAllEmpls() {
		List<EmpBO> lstempbo = dao.retriveEmp();
		List<EmpDTO> lstempdto = new ArrayList<EmpDTO>();
		for (EmpBO bo : lstempbo) {
			EmpDTO empdto = new EmpDTO(bo.getNo(), bo.getName(), bo.getJob(), bo.getSalary());
			lstempdto.add(empdto);
		}
		return lstempdto;

	}

}
