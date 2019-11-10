package com.jdbc.dao;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

import com.bo.model.Employee;
import com.jdbc.mapper.EmployeeMapper;

public class DBOperationDAO {

	private JdbcTemplate jt;

	private static final String INSERT_QRY = "insert into employee(EmpNo,Name,Job,Salary) values(?,?,?,?)";
	private static final String GET_EMP_SALARY = "select Salary from employee where EmpNo=?";
	private static final String GET_ALL_EMP_DETAIL = "select * from employee";
	private static final String GET_EMP_DETAIL = "select * from employee where EmpNO=?";

	
	// non select
	public String insert(int no, String name, String job, double salary) {
		int result = jt.update(INSERT_QRY, no, name, job, salary);
		if (result != 0)
			return "insertion success....";
		else
			return "Insertion fail...";
	}

	
	
	
	//query for object
	public Employee getSalary(int no) {
		return jt.queryForObject(GET_EMP_SALARY, new Object[] { no }, new EmployeeMapper());
	}

	//query for map
	public Map<String, Object> listEmpDetail(int no) throws Exception {
		Map<String, Object> map = jt.queryForMap(GET_EMP_DETAIL, no);
		if(map!=null)
			return map;
		else
			throw new Exception("No record found "); 
	}

	//query for list
	public List<Map<String, Object>> listAllEmpDetail() throws Exception {
		List<Map<String, Object>> list = jt.queryForList(GET_ALL_EMP_DETAIL);
		if(list!=null)
			return list;
		else
			throw new Exception("No record found "); 
	}

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

}
