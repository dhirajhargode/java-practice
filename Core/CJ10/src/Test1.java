import java.util.ArrayList;

public class Test1 {

	public String toString()				// override to String method 

	{
		return "test1";
	}
	public static void main(String[] args) {
		String s=new String("durga");
		System.out.println(s);			


		Integer i=new Integer(10);
		System.out.println(i);
		
		ArrayList l=new ArrayList();
		l.add("A");
		l.add("B");
		System.out.println(l);
		
		Test1 t=new Test1();
		System.out.println(t);
				
		
		 
	}
}
