import java.util.Scanner;
class EmployeeDetails{
	public static void main(String[] args){
		
		Employee emp = new Employee();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter ID ");
		emp.setId(sc.nextInt());
		
		System.out.print("Enter Name ");
		emp.setName(sc.next().toUpperCase());
		
		System.out.print("Enter Age ");
		emp.setAge(sc.nextInt());
		
		System.out.print("Enter Gender ");
		emp.setGender(sc.next().toUpperCase().charAt(0));
		
		System.out.print("Enter Email ");
		emp.setEmail(sc.next());
		
		System.out.print("Enter Contact no ");
		emp.setContact(sc.nextLong());
		
		
		System.out.println("===========================");
		System.out.println("Your details is ");
		System.out.println("ID :"+emp.getId());
		System.out.println("Name :"+emp.getName());
		System.out.println("Age :"+emp.getAge());
		System.out.println("Gender :"+emp.getGender());
		System.out.println("Email :"+emp.getEmail());
		System.out.println("Contact no :"+emp.getContact());
		
	}
}
	