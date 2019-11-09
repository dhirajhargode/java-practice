package dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {

	@Id
	private Integer bookId;
	private String bookTitle;
	private String author;
	private Integer rackNo;
	private Integer shelfNo;

	public Book() {
	}

	/**
	 * @param bookId
	 * @param bookTitle
	 * @param author
	 * @param rankNo
	 * @param shelfNo
	 */
	public Book(Integer bookId, String bookTitle, String author, Integer rackNo, Integer shelfNo) {
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.author = author;
		this.rackNo = rackNo;
		this.shelfNo = shelfNo;
	}

	/**
	 * @param bookTitle
	 */
	public Book(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Integer getRackNo() {
		return rackNo;
	}

	public void setRackNo(Integer rackNo) {
		this.rackNo = rackNo;
	}

	public Integer getShelfNo() {
		return shelfNo;
	}

	public void setShelfNo(Integer shelfNo) {
		this.shelfNo = shelfNo;
	}

	@Override
	public String toString() {
		return bookId + " " + bookTitle + " " + author + " " + rackNo + " " + shelfNo;
	}

}
