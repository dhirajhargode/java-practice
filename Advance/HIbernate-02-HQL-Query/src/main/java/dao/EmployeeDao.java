package dao;

import java.util.List;

import dto.Employee;

public interface EmployeeDao {

	public void insertEmployee(Employee e);

	public List<Employee> selectAll();

	public List<Employee> selectWhere(String column, String name);

	public List<Employee> selectNameLike(String name);

	public List<Employee> selectOrderByAsc(String column);

	public List<Employee> selectOrderByDesc(String column);

	public List<String> selectColumnName(String column);

	public List<Object[]> selectEmployeeSalary();

}
