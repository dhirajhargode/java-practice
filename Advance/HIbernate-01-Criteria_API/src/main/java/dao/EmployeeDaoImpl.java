package dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import dto.Employee;

public class EmployeeDaoImpl implements EmployeeDAO {

	private static SessionFactory factory = getFacotyInstance();
	private Session session = null;
	private Transaction trx = null;
	private Criteria query = null;

	public static SessionFactory getFacotyInstance() {
		return new Configuration().configure().buildSessionFactory();
	}

	public void display(List<Employee> list) {
		for (Employee e : list)
			System.out.println(e);
	}

	public void displayNames(List<String> list) {
		for (String e : list)
			System.out.println(e);
	}

	public void insertEmployee(Employee emp) {

		try {
			session = factory.openSession();
			trx = session.beginTransaction();
			session.save(emp);
			trx.commit();
			session.close();
		} catch (Exception e) {
			trx.rollback();
			session.close();
		}
	}

	public List<Employee> selectRecord() {
		List<Employee> list = null;
		try {
			session = factory.openSession();
			trx = session.beginTransaction();
			query = session.createCriteria(Employee.class);
			list = query.list();
			trx.commit();
			session.close();
		} catch (Exception e) {
			trx.rollback();
			session.close();
		}
		return list;
	}

	public List<Employee> selectWhereNameEq(String name) {
		List<Employee> list = null;
		try {
			session = factory.openSession();
			trx = session.beginTransaction();
			query = session.createCriteria(Employee.class);
			query.add(Restrictions.eq("empName", name));
			list = query.list();
			trx.commit();
			session.close();
		} catch (Exception e) {
			trx.rollback();
			session.close();
		}
		return list;
	}

	public List<Employee> selectRecordLike(String like) {
		List<Employee> list = null;
		try {
			session = factory.openSession();
			trx = session.beginTransaction();
			query = session.createCriteria(Employee.class);
			query.add(Restrictions.like("empName", like));
			list = query.list();
			trx.commit();
			session.close();

		} catch (Exception e) {
			trx.rollback();
			session.close();
		}
		return list;
	}

	public List<Employee> selectRecordAscOrder() {
		List<Employee> list = null;
		try {
			session = factory.openSession();
			trx = session.beginTransaction();
			query = session.createCriteria(Employee.class);
			query.addOrder(org.hibernate.criterion.Order.asc("salary"));
			list = query.list();
			trx.commit();
			session.close();
		} catch (Exception e) {
			trx.rollback();
			session.close();
		}
		return list;
	}

	public List<Employee> selectRecordDescOrder() {
		List<Employee> list = null;
		try {
			session = factory.openSession();
			trx = session.beginTransaction();
			query = session.createCriteria(Employee.class);
			query.addOrder(org.hibernate.criterion.Order.desc("salary"));
			list = query.list();
			trx.commit();
			session.close();
		} catch (Exception e) {
			trx.rollback();
			session.close();
		}
		return list;
	}

	public List<String> selectName() {
		List<String> list = null;
		try {
			session = factory.openSession();
			trx = session.beginTransaction();
			query = session.createCriteria(Employee.class);
			ProjectionList pl = Projections.projectionList();
			pl.add(Projections.property("empName"));
			query.setProjection(pl);
			list = query.list();
			trx.commit();
			session.close();
		} catch (Exception e) {
			trx.rollback();
			session.close();
		}
		return list;
	}

	public List<Object[]> selectNameBasicSalary() {
		List<Object[]> list = null;
		try {
			session = factory.openSession();
			trx = session.beginTransaction();
			query = session.createCriteria(Employee.class);
			ProjectionList pl = Projections.projectionList();
			pl.add(Projections.property("empName"));
			pl.add(Projections.property("salary"));
			query.setProjection(pl);
			list = query.list();
			trx.commit();
			session.close();
		} catch (Exception e) {
			trx.rollback();
			session.close();
		}
		return list;
	}
}
