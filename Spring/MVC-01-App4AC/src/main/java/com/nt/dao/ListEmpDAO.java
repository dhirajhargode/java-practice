package com.nt.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.nt.bo.EmpBO;

public class ListEmpDAO {

	private static final String GET_ALL_EMP_DETAILS = "SELECT EMPNO, NAME, JOB , SALARY FROM EMPLOYEE";

	private JdbcTemplate jt;

	public JdbcTemplate getJt() {
		return jt;
	}

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	public List<EmpBO> retriveEmp() {
		List<EmpBO> lstempbo = jt.query(GET_ALL_EMP_DETAILS, new EmpRowMapper());
		return lstempbo;

	}

}
