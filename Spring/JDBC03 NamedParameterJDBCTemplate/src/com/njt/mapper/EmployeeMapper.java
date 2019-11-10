package com.njt.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.njt.model.Employee;

public class EmployeeMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int index) throws SQLException {

		Employee e = new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4));

		return e;
	}

}
