package com.nt.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;

import com.nt.model.EmployeeBO;

public class EmployeeDAO {

	private static final String inset_emp = "insert into employee values(?,?,?,?) ";
	private JdbcTemplate jt;

	public int[] insert(List<EmployeeBO> listemp) {
		int[] result = jt.batchUpdate(inset_emp, new BatchPreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps, int index) throws SQLException {
				EmployeeBO ebo = listemp.get(index);
				ps.setInt(1, ebo.getEno());
				ps.setString(2, ebo.getName());
				ps.setString(3, ebo.getJob());
				ps.setDouble(4, ebo.getSalary());

			}

			@Override
			public int getBatchSize() {

				return listemp.size();
			}
		});
		return result;

	}

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

}
