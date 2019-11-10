package java.lang;

class Student{
	String name;
	int rollNo;	
	
	Student(String name,int rollNo){
		
		this.name= name;
		this.rollNo = rollNo;
		
	}

}
public class ToStringMethod {

	public static void main(String[] args) {
		
		Student s1 =new Student("Dhiraj", 11);
		Student s2 =new Student("Suraj", 12);
		
		System.out.println(s1);
		System.out.println(s1.toString());
		System.out.println(s2);
		
		
		
	}
	
	
}
