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

import dto.User;

@Repository
public class UserDao {

	@Autowired
	private HibernateTemplate ht;

	public UserDao() {
	}

	public HibernateTemplate getHt() {
		return ht;
	}

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}

	public void createUser(User user) {

		ht.execute(new HibernateCallback<List<User>>() {
			@Override
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

	public List<User> login(User user) {
		List<User> list = ht.execute(new HibernateCallback<List<User>>() {

			@Override
			public List<User> doInHibernate(Session session) throws HibernateException {
				Transaction t = session.beginTransaction();
				Query q = session.createQuery("from User where userName = ? and passWord = ?");
				q.setString(0, user.getUserName());
				q.setString(1, user.getPassWord());
				List<User> l = q.list();
				t.commit();
				session.flush();
				session.close();
				return l;
			}
		});

		return list;
	}

	public List<User> selectList() {

		List<User> list = ht.execute(new HibernateCallback<List<User>>() {

			@Override
			public List<User> doInHibernate(Session session) throws HibernateException {
				Transaction trx = session.beginTransaction();
				Query q = session.createQuery("from User");
				List<User> l = q.list();
				trx.commit();
				session.flush();
				session.close();
				return l;
			}
		});

		return list;
	}

	public List<User> deleteRecord(final User user) {

		ht.execute(new HibernateCallback<List<User>>() {

			@Override
			public List<User> doInHibernate(Session session) throws HibernateException {
				Transaction trx = session.beginTransaction();
				session.delete(user);
				trx.commit();
				session.flush();
				session.close();
				return null;
			}
		});

		return null;

	}

	public User fetchRecord(Integer uid) {

		User user = ht.execute(new HibernateCallback<User>() {

			@Override
			public User doInHibernate(Session session) throws HibernateException {
				Transaction trx = session.beginTransaction();
				User u = (User) session.get(User.class, uid);
				trx.commit();
				session.flush();
				session.close();
				return u;
			}
		});

		return user;
	}

	public void updateUser(User user) {
		ht.execute(new HibernateCallback<List<User>>() {

			@Override
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
}
