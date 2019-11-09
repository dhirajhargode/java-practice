package test;

import java.util.Date;
import java.util.List;

import dao.EmployeeDaoImpl;
import dto.Employee;

public class TestMain {

	public static void main(String[] args) {
		List<Employee> list = null;
		EmployeeDaoImpl e = new EmployeeDaoImpl();
		Employee emp1 = new Employee(103, "Kailas", 50000.0d, new Date());
		// e.insertEmployee(emp1);

		// list = e.selectRecord();
		// e.display(list);

		// System.out.println("======================");
		// list = e.selectWhereNameEq("kapil");
		// e.display(list);

		// list = e.selectRecordLike("k%");
		// e.display(list);
		// list = e.selectRecordDescOrder();
		// e.display(list);

		// List<String> l = e.selectName();
		// e.displayNames(l);

		// List<Object[]> l2 = e.selectNameBasicSalary();
		// for (Object obj[] : l2) {
		// System.out.println(obj[0] + " " + obj[1]);
		// }
		
		
		
	}
}
