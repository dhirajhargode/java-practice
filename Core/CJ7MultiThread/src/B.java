
public class B {
	public synchronized void d2(A a) {
		System.out.println("thread2 start execution d2() ");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

		}
		System.out.println("thread callig B last() method ");
		a.last();
		
	}
	public synchronized void last()
	{
		System.out.println("B last() method");
	}
	
}
