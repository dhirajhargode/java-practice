package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.RowMapper;

import com.nt.bo.EmpBO;

public class EmpRowMapper implements RowMapper<EmpBO> {

	public EmpBO mapRow(ResultSet rs, int pos) throws SQLException {
		EmpBO empbo = new EmpBO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4));
		return empbo;
	}

}
