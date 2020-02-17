package com.dc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.dc.model.Book;

public class BookMapper implements RowMapper<Book>{

	@Override
	public Book mapRow(ResultSet rs, int rowindex) throws SQLException {
		Book b=new Book();
		
		b.setBid(rs.getInt(1));
		b.setAname(rs.getString(2));
		b.setBname(rs.getString(3));
		b.setPrice(rs.getDouble(4));
		b.setIsbn(rs.getString(5));
		
		return b;
	}
	
	
	

}