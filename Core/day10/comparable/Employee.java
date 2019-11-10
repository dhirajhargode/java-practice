import java.util.*;
public class Employee implements Comparable<Employee>,Comparator<Employee> {
	private String empName;
	private Integer empId;
	public Employee(){
	}
	
	public Employee(String empName,Integer empId){
		this.empId = empId;
		this.empName = empName;	
	}	
	public boolean equals(Object o){
		
		try{
			Employee emp = (Employee)o;
			if(this.empId.equals(emp.empId) && this.empName.equals(emp.empName))
				return true;
			
		}catch(ClassCastException | NullPointerException e){
			return false;
		}
		return false;
	}
	
	public int hashCode(){
		Integer prime = 17;
		Integer result = 1;
		result = result + prime * this.empId.hashCode();
		result = result + prime * this.empName.hashCode();
		return result;
	}
	
	public String toString(){
	return "\nEMPLOYEE => Id : " + empId + ", Name : " + empName;
	}
	
	@Override
	public int compare(Employee emp1, Employee emp2) {
		return emp1.empName.compareTo(emp2.empName);
	}
	
	public int compareTo(Employee e){
		return empId.compareTo(e.empId);
	}
}