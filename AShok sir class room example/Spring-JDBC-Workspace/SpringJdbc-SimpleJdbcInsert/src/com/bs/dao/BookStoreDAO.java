package com.bs.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

public class BookStoreDAO {

	private static final String INSERT_EMP = "INSERT INTO BOOK_STORE(BOOK_ID,AUTHOR_NAME,BOOK_NAME,BOOK_PRICE,BOOK_ISBN)"
			+ " VALUES (:bid,:aname,:bname,:bprice,:bisbn)";

	private SimpleJdbcInsert jdbcInsert;

	/**
	 * This method is used to Insert record with given values with positional
	 * parameters
	 * 
	 * @param bid
	 * @param aname
	 * @param bname
	 * @param price
	 * @param isbn
	 */
	public int insertBook(int bid, String aname, String bname, double price, String isbn) {
		jdbcInsert.setTableName("BOOK_STORE");
		Map<String, Object> params = new HashMap();
		params.put("BOOK_ID", bid);
		params.put("AUTHOR_NAME", aname);
		params.put("BOOK_NAME", bname);
		params.put("BOOK_PRICE", price);
		params.put("BOOK_ISBN", isbn);
		return jdbcInsert.execute(params);
	}

	public void setJdbcInsert(SimpleJdbcInsert jdbcInsert) {
		this.jdbcInsert = jdbcInsert;
	}

}
