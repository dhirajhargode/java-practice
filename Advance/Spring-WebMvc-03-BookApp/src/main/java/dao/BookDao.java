package dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import dto.Book;

@Repository
public class BookDao {

	@Autowired
	private HibernateTemplate ht;

	public HibernateTemplate getHt() {
		return ht;
	}

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}

	public void addBook(Book book) {
		ht.execute(new HibernateCallback<List<Book>>() {

			@Override
			public List<Book> doInHibernate(Session session) throws HibernateException {
				Transaction trx = session.beginTransaction();
				session.save(book);
				trx.commit();

				session.flush();
				session.close();
				return null;
			}
		});

	}

	public List<Book> selectDataByBookName(String bk) {
		
		List<Book> lb = ht.execute(new HibernateCallback<List<Book>>() {

			@Override
			public List<Book> doInHibernate(Session session) throws HibernateException {
				Transaction trx = session.beginTransaction();
				Query q = session.createQuery("from Book where bookTitle = ?");
				q.setString(0, bk);
				List<Book> l = q.list();
				session.flush();
				session.close();
				return l;
			}
		});
		
		return lb;
	}

}
