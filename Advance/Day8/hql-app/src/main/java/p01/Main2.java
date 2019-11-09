package p01;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import dto.Employee;

public class Main2 {
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
		
//		selectSumOfBasicSalaryGroup();
		
		selectSumOfBasicSalaryGroupHaving();
		
		sf.close();

	}
	private static void selectAll() {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Query q = s.createQuery("from Employee");
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
		Query q = s.createQuery("from Employee where dept = ?");
		q.setString(0, "cs");
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
		Query q = s.createQuery("from Employee where empName like ?");
		q.setString(0, "s%");
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
		Query q = s.createQuery("from Employee order by basicSalary");
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
		Query q = s.createQuery("select empName from Employee");
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
		Query q = s.createQuery("select empName, basicSalary from Employee");
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
		Query q = s.createQuery("select sum(basicSalary) from Employee");
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
		Query q = s.createQuery("select dept,sum(basicSalary) from Employee group by dept");
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
