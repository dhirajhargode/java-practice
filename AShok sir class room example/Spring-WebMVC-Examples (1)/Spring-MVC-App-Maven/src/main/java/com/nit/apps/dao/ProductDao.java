package com.nit.apps.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.nit.apps.model.Product;

public class ProductDao {

	private static final String INSERT_SQL = "insert into products(P_ID,P_NAME,P_PRICE) values (?,?,?)";
	private static final String SELECT_SQL = " SELECT * FROM PRODUCTS";
	private static final String SELECT_SQL_BY_PID = " SELECT * FROM PRODUCTS where p_id=?";

	private JdbcTemplate jt;

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	public boolean insertProduct(Product p) {
		boolean isInserted = false;
		int cnt = jt.update(INSERT_SQL, p.getPid(), p.getPname(), p.getPrice());
		if (cnt > 0) {
			isInserted = true;
		}
		return isInserted;
	}

	public List<Product> retrieveAllProducts() {
		List<Product> productsList = jt.query(SELECT_SQL,
				new ProductRowMapper());

		return productsList;
	}

	public Product retrieveProductById(String pid) {
		Product p = jt.queryForObject(SELECT_SQL_BY_PID, new Object[] { pid },
				new ProductRowMapper());
		return p;
	}

}
