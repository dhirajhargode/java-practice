import java.lang.reflect.Method;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException {
		
		int count=0;
		Class c=Class.forName("Student");
		Method[]  m=c.getDeclaredMethods();
		for(Method m1:m)
		{
			count++;
			System.out.println(m1.getName());
		}
				
	}
}
