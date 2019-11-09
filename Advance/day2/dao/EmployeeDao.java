package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dto.Employee;

public class EmployeeDao {
	private static Connection con;
	static {
		try {
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/cdac_db","root","cdac");
		}catch (ClassNotFoundException e) {
			System.out.println(e);
		}catch(SQLException e) {
			System.out.println(e);
		}
	}
	
	public int addEmployee(Employee emp) {
		int i=0;
		try {
		PreparedStatement s = con.prepareStatement("insert into emp values(?,?,?,?)");
		s.setInt(1, emp.getEmpId());
		s.setString(2, emp.getEmpName());
		s.setFloat(3, emp.getBasicSalary());
		s.setString(4, emp.getHireDate());
		i = s.executeUpdate();
		s.close();
		}catch (SQLException e) {
			System.out.println(e);
		}
		return i;
	}

	public int deleteEmployee(Employee emp) {
		int i=0;
		try {
		PreparedStatement s = con.prepareStatement("delete from emp where emp_id = ?");
		s.setInt(1, emp.getEmpId());
		i = s.executeUpdate();
		s.close();
		}catch (SQLException e) {
			System.out.println(e);
		}
		return i;
	}
	
	public int updateEmployee(Employee emp) {
		int i=0;
		try {
		PreparedStatement s = con.prepareStatement("update emp set emp_name = ?, basic_salary = ?, hire_date = ? where emp_id = ?");
		
		s.setString(1, emp.getEmpName());
		s.setFloat(2, emp.getBasicSalary());
		s.setString(3, emp.getHireDate());
		s.setInt(4, emp.getEmpId());
		i = s.executeUpdate();
		s.close();
		}catch (SQLException e) {
			System.out.println(e);
		}
		return i;
	}
	
	public ArrayList<Employee> selectEmployees() {
		ArrayList<Employee> l = new ArrayList<>();
		try {
		PreparedStatement s = con.prepareStatement("select * from emp");
		ResultSet rs = s.executeQuery();
		while(rs.next()) {
			Employee e = new Employee();
			e.setEmpId(rs.getInt(1));
			e.setEmpName(rs.getString(2));
			e.setBasicSalary(rs.getFloat(3));
			e.setHireDate(rs.getString(4));
			l.add(e);
		}
		s.close();
		}catch (SQLException e) {
			System.out.println(e);
		}
		return l;
	}
	
	public static void closeConn() {
		try {
			con.close();
		}catch (SQLException e) {
			System.out.println(e);
			
		}
	}
	
}
