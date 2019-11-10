import java.util.LinkedList;

public class LinkListDemo {
	public static void main(String[] args) {
		
		LinkedList l=new LinkedList();
		l.add("A");
		l.add(10);
		l.add("A");
		l.add(null);
		System.out.println(l);				//[A, 10, A, null]
		
		l.set(0, "software");				
		System.out.println(l);				// [software, 10, A, null]
		
		l.removeLast();
		System.out.println(l);				// [software, 10, A]
		
		l.addFirst("vvv");
		System.out.println(l);				//[vvv, software, 10, A]
		
		

		
	}
}
