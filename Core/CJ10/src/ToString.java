
public class ToString {

	String name;
	int rollno;

	public ToString(String name, int rollno) {

		this.name = name;
		this.rollno = rollno;

	}

	public static void main(String[] args) {
		ToString t1 = new ToString("Dhiraj", 101);
		ToString t2 = new ToString("Ashok", 102);

		System.out.println(t1);
		System.out.println(t1.toString());
		System.out.println(t2);

	}
}
