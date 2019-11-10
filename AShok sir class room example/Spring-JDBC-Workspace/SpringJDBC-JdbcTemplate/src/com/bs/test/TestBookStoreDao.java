package com.bs.test;

import java.util.List;
import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bs.dao.BookStoreDAO;
import com.bs.model.Book;

public class TestBookStoreDao {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/bs/cfg/Beans.xml");
		BookStoreDAO dao = context.getBean("dao", BookStoreDAO.class);
		
		//dao.insertBook(102, "Rod Johnson", "Spring Boot", 800.00, "ISBN002");
		
		//dao.insertBookWithPstmt(103, "Rod Johnson", "Spring Cloud", 400.00, "ISBN003");
		
		/*Book b  = dao.findBookById(101);
		System.out.println(b);*/
		
		/*List<Book> books =  dao.findAllBooks();
		if(!books.isEmpty()){
			for(Book b : books){
				System.out.println(b);
			}
		}*/
		
		//Testing batch
		/*List<Book> booksList = new ArrayList<Book>();
		booksList.add(new Book(105, "Spring", "Rod","ISN001", 450.00));
		booksList.add(new Book(106, "Webservices", "Hafeez","ISBN002", 550.00));
		dao.insertBooksUsingBatch(booksList);*/

		
	}

}
