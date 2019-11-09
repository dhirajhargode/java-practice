 package p01;

import java.util.ArrayList;
import java.util.Scanner;

import dao.EmployeeDao;
import dto.Employee;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeDao dao = new EmployeeDao();
		while(true) {
			System.out.println("0 to exit");
			System.out.println("1 to add employee");
			System.out.println("2 to delete employee");
			System.out.println("3 to update employee");
			System.out.println("4 to show employees");
			byte ch = sc.nextByte();
			switch (ch) {
			case 0:
				EmployeeDao.closeConn();
				System.exit(0);
			case 1:
				System.out.println("Enter emp id");
				int empId = sc.nextInt();
				System.out.println("Enter emp name");
				String empName =sc.next();
				System.out.println("Enter basic salary");
				float basicSalary = sc.nextFloat();
				System.out.println("Enter hire date");
				String hireDate = sc.next();
				Employee emp = new Employee(empId, empName, basicSalary, hireDate);
				int i = dao.addEmployee(emp);
				if(i>0) {
					System.out.println("record inserted");
				}
				break;	
			case 2:
				System.out.println("Enter emp id");
				empId = sc.nextInt();
				emp = new Employee(empId);
				i = dao.deleteEmployee(emp); 
				if(i>0) {
					System.out.println("record deleted");
				}
				break;
			case 3:
				System.out.println("Enter emp id");
				empId = sc.nextInt();
				System.out.println("Enter emp name");
				empName =sc.next();
				System.out.println("Enter basic salary");
				basicSalary = sc.nextFloat();
				System.out.println("Enter hire date");
				hireDate = sc.next();
				emp = new Employee(empId, empName, basicSalary, hireDate);
				i = dao.updateEmployee(emp);
				if(i>0) {
					System.out.println("record updated");
				}
				break;	
			case 4:
				ArrayList<Employee> list = dao.selectEmployees();
				for(Employee e : list) {
					System.out.println(e);
				}
				break;
			default:
				break;
			}
		}

	}

}
