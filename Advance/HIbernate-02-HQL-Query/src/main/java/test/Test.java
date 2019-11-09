package test;

import java.util.Date;
import java.util.List;

import dao.EmployeeDaoImpl;
import dto.Employee;

public class Test {

	private static List<Employee> list = null;
	private static List<String> list2 = null;
	private static List<Object[]> list3 = null;

	public static void main(String[] args) {

		EmployeeDaoImpl eimp = new EmployeeDaoImpl();
		// Employee e = new Employee(101, "Shubham", 25000.0d, new Date());
		// Employee e = new Employee(102, "Kailas", 30000.0d, new Date());
		// eimp.insertEmployee(e);

		// list = eimp.selectAll();
		// eimp.display(list);

		// list = eimp.selectWhere("empName", "Shubham");
		// eimp.display(list);

		// list = eimp.selectNameLike("%e");
		// if(!list.isEmpty())
		// eimp.display(list);
		// else
		// System.out.println("no entry available");

		// list = eimp.selectOrderByAsc("salary");
		// eimp.display(list);
		// list = eimp.selectOrderByDesc("salary");
		// eimp.display(list);

		// list2 = eimp.selectColumnName("empName");
		// eimp.displayName(list2);

		// list3 = eimp.selectEmployeeSalary();
		// eimp.displaySalary(list3);
		
		

	}
}
