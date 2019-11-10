
public class Demo {

	public static void main(String[] args) {
		
		Student s=new Student();
		Class c=s.getClass();
		System.out.println(c.hashCode());
		
		Student s1=new Student();
		Class c1=s.getClass();
		System.out.println(c1.hashCode());
		
		Customer ce=new Customer();
		Class c2=ce.getClass();
		System.out.println(c2.hashCode());
	}
}
