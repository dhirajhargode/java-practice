package dao;

import java.util.List;

import dto.Employee;

public interface EmployeeDAO {

	public void insertEmployee(Employee emp);

	public List<Employee> selectRecord();

	public List<Employee> selectWhereNameEq(String name);

	public List<Employee> selectRecordLike(String like);

	public List<Employee> selectRecordAscOrder();

	public List<Employee> selectRecordDescOrder();

	public List<String> selectName();

	public List<Object[]> selectNameBasicSalary();

}
