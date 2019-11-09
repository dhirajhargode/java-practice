package dto;



public class User {

	private Integer empId;
	private String empName;
	private Double basicSalary;

	public User() {
		System.out.println("User() 0 param constructor");
	}

	/**
	 * @param empId
	 * @param empName
	 * @param basicSalary
	 */
	public User(Integer empId, String empName, Double basicSalary) {
		this.empId = empId;
		this.empName = empName;
		this.basicSalary = basicSalary;
		System.out.println("User() 3 param constructor");

	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(Double basicSalary) {
		this.basicSalary = basicSalary;
	}

	@Override
	public String toString() {
		return empId + " " + empName + " " + basicSalary ;
	}
	
	

}
