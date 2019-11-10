
public class Test1 {
	public void m1()
	{
		final int x=10;
		class Inner
		{
			public void m2()
			{
				System.out.println(x);
			}
		}Inner i=new Inner();
			i.m2();
			}
			
	

	public static void main(String[] args) {
		Test1 t1 = new Test1();
		t1.m1();
	}
}
