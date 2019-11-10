
public class A {

	public synchronized void d1(B b) {
		System.out.println("thread1 start execution d1() ");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

		}
		System.out.println("thread callig A last() method ");
		b.last();
	}
	public synchronized void last()
	{
		System.out.println("A last() method");
	}
}
