package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;





import dto.User;

@Repository
public class UserDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	public UserDao() {
		super();
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}



	public void createUser(final User user) {
		hibernateTemplate.execute(new HibernateCallback<List<User>>() {

			public List<User> doInHibernate(Session session) throws HibernateException {
				Transaction t = session.beginTransaction();
				session.save(user);
				t.commit();
				session.flush();
				session.close();
				return null;
			}
		});
	}
	
	
	public void deleteUser(final User user) {
		hibernateTemplate.execute(new HibernateCallback<List<User>>() {

			public List<User> doInHibernate(Session session) throws HibernateException {
				Transaction t = session.beginTransaction();
				session.delete(user);
				t.commit();
				session.flush();
				session.close();
				return null;
			}
		});
	}
	
	public void updateUser(final User user) {
		hibernateTemplate.execute(new HibernateCallback<List<User>>() {

			public List<User> doInHibernate(Session session) throws HibernateException {
				Transaction t = session.beginTransaction();
				session.update(user);
				t.commit();
				session.flush();
				session.close();
				return null;
			}
		});
	}
	
	public List<User> selectUsers() {
		
		List<User> list = hibernateTemplate.execute(new HibernateCallback<List<User>>() {

			public List<User> doInHibernate(Session session) throws HibernateException {
				Transaction t = session.beginTransaction();
				Query q = session.createQuery("from User");
				List<User> ul = q.list();
				t.commit();
				session.flush();
				session.close();
				return ul;
			}
		});
		return list;
	}
	
	
	public List<User> login(final User user) {
		
		List<User> list = hibernateTemplate.execute(new HibernateCallback<List<User>>() {

			public List<User> doInHibernate(Session session) throws HibernateException {
				Transaction t = session.beginTransaction();
				Query q = session.createQuery("from User where userName = ? and userPass = ?");
				q.setString(0, user.getUserName());
				q.setString(1, user.getUserPass());
				List<User> ul = q.list();
				t.commit();
				session.flush();
				session.close();
				return ul;
			}
		});
		return list;
	}

	public User selectUser(int userId) {
		User user = hibernateTemplate.execute(new HibernateCallback<User>() {

			public User doInHibernate(Session session) throws HibernateException {
				Transaction t = session.beginTransaction();
				User u = (User)session.get(User.class, userId);
				t.commit();
				session.flush();
				session.close();
				return u;
			}
		});
		return user;
	}
	
}
