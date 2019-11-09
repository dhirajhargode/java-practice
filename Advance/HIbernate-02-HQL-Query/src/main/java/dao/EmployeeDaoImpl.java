package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import dto.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	private SessionFactory factory = new Configuration().configure().buildSessionFactory();
	private Transaction trx = null;
	private Session session = null;
	private Query query = null;
	private List<Employee> list = null;
	private List<String> list2 = null;
	private List<Object[]> list3 = null;

	public void display(List<Employee> list) {
		for (Employee e : list)
			System.out.println(e);
	}

	public void displayName(List<String> list) {
		for (String name : list)
			System.out.println(name);
	}

	public void displaySalary(List<Object[]> list) {
		for (Object[] obj : list)
			System.out.println(obj[0] + " " + obj[1]);
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

	public List<Employee> selectAll() {
		try {
			session = factory.openSession();
			trx = session.beginTransaction();
			query = session.createQuery("from Employee");
			list = query.list();
			trx.commit();
			session.close();
		} catch (Exception e) {
			trx.rollback();
			session.close();
		}
		return list;
	}

	public List<Employee> selectWhere(String column, String name) {
		try {
			session = factory.openSession();
			trx = session.beginTransaction();
			query = session.createQuery("from Employee where " + column + " = ?");
			query.setString(0, name);
			list = query.list();
			trx.commit();
			session.close();
		} catch (Exception e) {
			trx.commit();
			session.close();
		}
		return list;
	}

	public List<Employee> selectNameLike(String name) {

		try {
			session = factory.openSession();
			trx = session.beginTransaction();
			query = session.createQuery("from Employee where empName like ?");
			query.setString(0, name);
			list = query.list();
			trx.commit();
			session.close();
		} catch (Exception e) {
			trx.rollback();
			session.close();
		}
		return list;
	}

	public List<Employee> selectOrderByAsc(String column) {
		try {
			session = factory.openSession();
			trx = session.beginTransaction();
			query = session.createQuery("from Employee order by " + column);
			list = query.list();
			trx.commit();
			session.close();
		} catch (Exception e) {
			trx.rollback();
			session.close();
		}

		return list;
	}

	public List<Employee> selectOrderByDesc(String column) {
		try {
			session = factory.openSession();
			trx = session.beginTransaction();
			query = session.createQuery("from Employee order by " + column + " desc");
			list = query.list();
			trx.commit();
			session.close();
		} catch (Exception e) {
			trx.rollback();
			session.close();
		}
		return list;
	}

	public List<String> selectColumnName(String column) {
		try {
			session = factory.openSession();
			trx = session.beginTransaction();
			query = session.createQuery("select " + column + " from Employee");
			list2 = query.list();
			trx.commit();
			session.close();

		} catch (Exception e) {
			trx.rollback();
			session.close();
		}
		return list2;
	}

	public List<Object[]> selectEmployeeSalary() {
		try {
			session = factory.openSession();
			trx = session.beginTransaction();
			query = session.createQuery("select empName, salary from Employee");
			list3 = query.list();
			trx.commit();
			session.close();

		} catch (Exception e) {
			trx.rollback();
			session.close();
		}
		return list3;
	}

}
