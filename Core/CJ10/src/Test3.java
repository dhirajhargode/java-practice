import java.lang.reflect.Method;

public class Test3 {
	
	public static void main(String[] args) throws ClassNotFoundException {
		int count=0;
		Class c=Class.forName("java.util.Date");
		Method[] m = c.getDeclaredMethods();
		for(Method  m1 : m) {
			count++;
			System.out.println(m1.getName());
			
		}
		System.out.println(count);
	}

}
