import java.util.Stack;

public class StackDemo {
		public static void main(String[] args) {
			
			Stack s= new Stack();
			s.push("A");							// Add element
			s.push("B");
			s.push("C");
			
			System.out.println(s);							//   [A, B, C]
			System.out.println(s.search("A"));;				// 3
			System.out.println(s.search("Z"));				// -1
			
		}
}
