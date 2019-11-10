
public class NewThread extends Thread{

	A a=new A();
	B b=new B();
	public void m1() {
		this.start();
		a.d1(b);         //main thread
	}
	public void run()
	{
		b.d2(a);           //child thread 
	}
	
	
	public static void main(String[] args) {
		NewThread t=new NewThread();
		t.m1();
	}
	
}
