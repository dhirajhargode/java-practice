package cntr;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.BookDao;
import dto.Book;

@Controller
public class BookController {

	@Autowired
	private BookDao dao;
	private Book book;

	public BookDao getDao() {
		return dao;
	}

	public void setDao(BookDao dao) {
		this.dao = dao;
	}

	@RequestMapping(value = "/book_form.htm")
	public String bookPrepForm(ModelMap model) {
		model.put("book", new Book());
		return "book_form";
	}

	@RequestMapping(value = "/add_book.htm")
	public String storeBook(Book book, ModelMap model) {
		dao.addBook(book);
		model.put("book", new Book());
		return "book_form";
	}
	
	@RequestMapping(value = "/search_book.htm")
	public String searchBook(HttpServletRequest req ,Book book, ModelMap model) {
		System.out.println(req.getParameter("bookTitle"));;
		return "book_form";
	}

}
