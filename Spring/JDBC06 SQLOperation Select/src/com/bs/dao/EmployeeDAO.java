package com.bs.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;

import com.bs.model.EmployeeBO;

public class EmployeeDAO {

	private static final String FIND_BY_NAME = "SELECT * FROM EMPLOYEE WHERE NAME LIKE ?";
	/*
	 * private static final String
	 * FIND_BY_NAME="SELECT * FROM EMPLOYEE WHERE NAME = ?";
	 */
	private DataSource ds;

	public List<EmployeeBO> findByName(String ename) {
		SelectEmployee se = new SelectEmployee(ds, FIND_BY_NAME);
		return se.getEmpByName(ename);

	}

	private static final class SelectEmployee extends MappingSqlQuery<EmployeeBO> {

		public SelectEmployee(DataSource ds, String query) {
			super(ds, FIND_BY_NAME);
			declareParameter(new SqlParameter(Types.VARCHAR));
			compile();

		}

		protected EmployeeBO mapRow(ResultSet rs, int index) throws SQLException {
			EmployeeBO e = new EmployeeBO();
			e.setEid(rs.getInt(1));
			e.setName(rs.getString(2));
			e.setJob(rs.getString(3));
			e.setSal(rs.getDouble(4));

			return e;
		}

		public List<EmployeeBO> getEmpByName(String name) {
			return execute("%" + name + "%");

		}
	}

	public DataSource getDs() {
		return ds;
	}

	public void setDs(DataSource ds) {
		this.ds = ds;
	}

}
