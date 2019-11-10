
class Employee{

	private Integer empId;
	private String name;
	private Double salary;
	private Character gender;
	
	Employee(Integer empId,String name,Double salary,Character gender){
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.gender = gender;
	}
	
	public String toString(){
		
		return empId + " " + name + " " + salary + " " +gender;
		
	}
	
	public boolean equals(Object o){
		
		if(o != null){
				if(o instanceof Employee){
					Employee e = (Employee)o;
					if(empId.equals(e.empId) && name.equals(e.name) && salary.equals(e.salary) && gender.equals(e.gender))
						return true;
				}
		}
		return false;
	}
	
	public int hashCode(){
		int prime = 17 ;
		int result = 1;
		result = result + prime*empId.hashCode();
		result = result + prime*name.hashCode();
		result = result + prime*salary.hashCode();
		result = result + prime*gender.hashCode();
		
		return result;
	}
	

}