import java.util.Comparator;
import java.util.HashMap;

public class Employee implements Comparator<Employee> {

	String name;
	Integer id;

	public Employee() {
	}

	Employee(String name, Integer id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
	HashMap<Integer, Employee> map = new HashMap<>();
	
	public void add(Integer i , Employee emp) {
		
		if(!map.containsKey(i)) {
			map.put(i, emp);
		}else {
			System.out.println("Already exist");
		}
			
			
		
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "Employee: Id " + id + " Name " + name;
	}

	@Override
	public boolean equals(Object obj) {

		Employee emp = (Employee) obj;

		if (emp instanceof Employee) {

			if (id.equals(emp.id) && name.equals(emp.name))
				return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		int prime = 2;
		int result = 1;
		result = result + prime * this.id.hashCode();
		result = result + prime * this.name.hashCode();
		return result;
	}

	@Override
	public int compare(Employee emp1, Employee emp2) {
		return emp1.getId().compareTo(emp2.getId());
	}

}
