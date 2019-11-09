package com.cdac.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cdac.dto.User;

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

	@RequestMapping("/reg_form.htm")
	public void createUser(final User user) {
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

}
