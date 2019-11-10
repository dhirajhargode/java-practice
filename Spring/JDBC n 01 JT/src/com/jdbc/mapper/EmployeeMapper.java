package com.jdbc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.bo.model.Employee;

public class EmployeeMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int index) throws SQLException {

		Employee emp = new Employee();
		emp.setNo(rs.getInt(1));
		emp.setName(rs.getString(2));
		emp.setJob(rs.getString(3));
		emp.setSalary(rs.getDouble(4));
		return emp;
	}

}
