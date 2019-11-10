import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String[] args) {
	
		ArrayList l=new ArrayList();
		l.add("A");
		l.add(10);
		l.add("A");
		l.add(null);
		System.out.println(l);  						//[A 10 A NULL ]
		
		l.remove(2);							// 2ND ARRAY REMOVE
		System.out.println(l);					// [A 10 NULL ]
		
		l.add(2,"N");
		l.add("M");
		System.out.println(l);				// [A, 10, N, null, M]

		
		
	}

}
