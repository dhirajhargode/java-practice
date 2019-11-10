package com.bs.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class BookStoreDAO {

	private static final String INSERT_EMP = "INSERT INTO BOOK_STORE(BOOK_ID,AUTHOR_NAME,BOOK_NAME,BOOK_PRICE,BOOK_ISBN)"
			+ " VALUES (:bid,:aname,:bname,:bprice,:bisbn)";

	private NamedParameterJdbcTemplate jdbcTemplate;

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
	public void insertBook(int bid, String aname, String bname, double price, String isbn) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("bid", bid);
		paramMap.put("aname", aname);
		paramMap.put("bname", bname);
		paramMap.put("bprice", price);
		paramMap.put("bisbn", isbn);
		
		jdbcTemplate.update(INSERT_EMP, paramMap);

	}

	public NamedParameterJdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(NamedParameterJdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
