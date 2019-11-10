package com.sjdbci.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

public class EmployeeDAO {

	private SimpleJdbcInsert simpleInsert;

	public int insert(int no, String name, String job, Double sal) {
		Map<String, Object> map = new HashMap<>();

		simpleInsert.setTableName("Employee");
		map.put("id", no);
		map.put("name", name);
		map.put("job", job);
		map.put("sal", sal);

		return simpleInsert.execute(map);

	}

	public SimpleJdbcInsert getSimpleInsert() {
		return simpleInsert;
	}

	public void setSimpleInsert(SimpleJdbcInsert simpleInsert) {
		this.simpleInsert = simpleInsert;
	}

}
