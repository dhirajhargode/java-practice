package p01;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import dto.Employee;

public class Main3 {
	private static SessionFactory sf;

	public static void main(String[] args) {
		sf = new Configuration().configure().buildSessionFactory();
		
//		selectAll();
//		selectWhere();
//		selectLike();
//		selectOrder();
//		selectName();
//		selectNameBasicSalary();
		
//		selectSumOfBasicSalary();
		
		selectSumOfBasicSalaryGroup();
		
//		selectSumOfBasicSalaryGroupHaving();
		
		sf.close();

	}
	private static void selectAll() {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria q = s.createCriteria(Employee.class);
		List<Employee> list = q.list();
		for(Employee e : list) {
			System.out.println(e);
		}
		t.commit();
		s.close();
	}
	
	private static void selectWhere() {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria q = s.createCriteria(Employee.class);
		q.add(Restrictions.eq("dept", "cs"));
		List<Employee> list = q.list();
		for(Employee e : list) {
			System.out.println(e);
		}
		t.commit();
		s.close();
	}
	
	private static void selectLike() {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria q = s.createCriteria(Employee.class);
		q.add(Restrictions.like("empName", "s%"));
		
		List<Employee> list = q.list();
		for(Employee e : list) {
			System.out.println(e);
		}
		t.commit();
		s.close();
	}
	
	private static void selectOrder() {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria q = s.createCriteria(Employee.class);
		q.addOrder(Order.asc("basicSalary"));
		List<Employee> list = q.list();
		for(Employee e : list) {
			System.out.println(e);
		}
		t.commit();
		s.close();
	}
	

	private static void selectName() {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria q = s.createCriteria(Employee.class);
		
		ProjectionList pl = Projections.projectionList();
		pl.add(Projections.property("empName"));
		
		q.setProjection(pl);
		
		List<String> list = q.list();
		for(String e : list) {
			System.out.println(e);
		}
		t.commit();
		s.close();
	}
	
	private static void selectNameBasicSalary() {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria q = s.createCriteria(Employee.class);
		
		ProjectionList pl = Projections.projectionList();
		pl.add(Projections.property("empName"));
		pl.add(Projections.property("basicSalary"));
		
		q.setProjection(pl);
		
		
		List<Object[]> list = q.list();
		for(Object[] e : list) {
			System.out.println(e[0]+"  "+e[1]);
		}
		t.commit();
		s.close();
	}
	
	private static void selectSumOfBasicSalary() {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria q = s.createCriteria(Employee.class);
		
		ProjectionList pl = Projections.projectionList();
		pl.add(Projections.sum("basicSalary"));
		
		q.setProjection(pl);
		List<Double> list = q.list();
		for(Double e : list) {
			System.out.println(e);
		}
		t.commit();
		s.close();
	}
	
	private static void selectSumOfBasicSalaryGroup() {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria q = s.createCriteria(Employee.class);
		
		ProjectionList pl = Projections.projectionList();
		pl.add(Projections.groupProperty("dept"));
		pl.add(Projections.sum("basicSalary"));
		
		q.setProjection(pl);
		List<Object[]> list = q.list();
		for(Object[] e : list) {
			System.out.println(e[0]+" "+e[1]);
		}
		t.commit();
		s.close();
	}
	
	private static void selectSumOfBasicSalaryGroupHaving() {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Query q = s.createQuery("select dept,sum(basicSalary) from Employee group by dept having sum(basicSalary) > ?");
		q.setFloat(0, 222222.22f);
		List<Object[]> list = q.list();
		for(Object[] e : list) {
			System.out.println(e[0]+" "+e[1]);
		}
		t.commit();
		s.close();
	}
}
