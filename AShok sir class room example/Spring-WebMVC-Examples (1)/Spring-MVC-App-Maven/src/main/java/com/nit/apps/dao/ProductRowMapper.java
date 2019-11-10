package com.nit.apps.dao;

import org.springframework.jdbc.core.RowMapper;

import com.nit.apps.model.Product;

public class ProductRowMapper implements RowMapper<Product> {

	public Product mapRow(java.sql.ResultSet rs, int arg1)
			throws java.sql.SQLException {
		Product p = new Product();
		p.setPid(rs.getInt("P_ID"));
		p.setPname(rs.getString("P_NAME"));
		p.setPrice(rs.getDouble("P_PRICE"));
		return p;
	}
}
