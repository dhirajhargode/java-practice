package com.bs.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.bs.model.Book;

public class BookMapper implements RowMapper<Book> {
	@Override
	public Book mapRow(ResultSet rs, int rowIndex) throws SQLException {
		Book b = new Book();
		b.setBookId(rs.getInt(1));
		b.setAutorName(rs.getString(2));
		b.setBookName(rs.getString(3));
		b.setPrice(rs.getDouble(4));
		b.setIsbn(rs.getString(5));
		return b;
	}
}
