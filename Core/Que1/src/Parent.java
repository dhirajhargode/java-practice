
public class Parent extends GrandParent {
	
	String fatherName ;
	String motherName ;

	public Parent(String grandFatherName, String grandMotherName) {
		super(grandFatherName, grandMotherName);
	}
		
	public static void main(String[] args) {
		int a[] = new int[30];
		int y =a.length;
		
		try {
			int x = 10/0;
		}catch (ArithmeticException ae) {
			ae.printStackTrace();
		}
		
	}
		
		
		
		
}
