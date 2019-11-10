package com.bs.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

import com.bs.mappers.BookMapper;
import com.bs.model.Book;

public class BookStoreDAO {

	private static final String FIND_BOOK_BY_ID = "SELECT * FROM BOOK_STORE WHERE BOOK_ID=?";
	private static final String INSERT_EMP = "INSERT INTO BOOK_STORE(BOOK_ID,AUTHOR_NAME,BOOK_NAME,BOOK_PRICE,BOOK_ISBN) VALUES (?,?,?,?,?)";
	private static final String FIND_ALL_BOOKS = "SELECT * FROM BOOK_STORE";

	private JdbcTemplate jdbcTemplate;

	
	/**
	 * This method is used to Insert record with given values with positional parameters
	 * @param bid
	 * @param aname
	 * @param bname
	 * @param price
	 * @param isbn
	 */
	public void insertBook(int bid, String aname, String bname, double price, String isbn) {
		int no = jdbcTemplate.update(INSERT_EMP, bid, aname, bname, price, isbn);
		if (no > 0) {
			System.out.println("Inserted....");
		} else {
			System.out.println("failed....");
		}
	}

	/**
	 * This method is used to Insert record with given values using PSTMT
	 * @param bid
	 * @param aname
	 * @param bname
	 * @param price
	 * @param isbn
	 */
	public void insertBookWithPstmt(int bid, String aname, String bname, double price, String isbn) {
		PreparedStatementCallback<Boolean> pstmtCallBk = new PreparedStatementCallback<Boolean>() {
			@Override
			public Boolean doInPreparedStatement(PreparedStatement pstmt) throws SQLException, DataAccessException {
				pstmt.setInt(1, bid);
				pstmt.setString(2, aname);
				pstmt.setString(3, bname);
				pstmt.setDouble(4, price);
				pstmt.setString(5, isbn);
				return pstmt.execute();
			}
		};

		jdbcTemplate.execute(INSERT_EMP, pstmtCallBk);
	}

	
	/**
	 * This method is used to retrive book record using id
	 * @param bookId
	 * @return
	 */
	public Book findBookById(int bookId) {
		return jdbcTemplate.queryForObject(FIND_BOOK_BY_ID, new Object[] { bookId }, new BookMapper());
	}

	
	/**
	 * This method is used to retrieve all records from the table
	 * @return
	 */
	public List<Book> findAllBooks() {
		return jdbcTemplate.query(FIND_ALL_BOOKS, new BookMapper());
	}
	
	
	/**
	 * This method is used to insert records using batch operation
	 * @param books
	 */
	public void insertBooksUsingBatch(final List<Book> books){
		jdbcTemplate.batchUpdate(INSERT_EMP, new BatchPreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement pstmt, int i) throws SQLException {
				Book b = books.get(i);
				pstmt.setInt(1, b.getBookId());
				pstmt.setString(2, b.getAutorName());
				pstmt.setString(3, b.getBookName());
				pstmt.setDouble(4, b.getPrice());
				pstmt.setString(5, b.getIsbn());
			}
			
			@Override
			public int getBatchSize() {
				return books.size();
			}
		});
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
