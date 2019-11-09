package com.orm.dao;

import java.util.List;

import org.hibernate.FlushMode;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.orm.dto.User;

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

	public void createUser(final User user) {

		ht.execute(new HibernateCallback<List<User>>() {
			public List<User> doInHibernate(Session session) throws HibernateException {
				System.out.println("session  " + session);
				session.setFlushMode(FlushMode.COMMIT);
				Transaction t = session.beginTransaction();
				System.out.println("transaction  " + t);
				session.save(user);
				t.commit();
				System.out.println("transaction  " + t);
				session.flush();
				session.close();
				return null;
			}
		});

	}

	public void updateUser(final User user) {
		ht.execute(new HibernateCallback<List<User>>() {

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

	public void deletUser(final User user) {
		ht.execute(new HibernateCallback<List<User>>() {

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

	public List<User> selectList() {

		List<User> list = ht.execute(new HibernateCallback<List<User>>() {

			public List<User> doInHibernate(Session session) throws HibernateException {
				Transaction t = session.beginTransaction();
				Query q = session.createQuery("from User");
				List<User> l = q.list();
				t.commit();
				session.flush();
				session.close();
				return l;
			}
		});
		return list;
	}

}
