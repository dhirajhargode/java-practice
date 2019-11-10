package gettingSetting;

public class Demo {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());
		MyThread1 t = new MyThread1();
		System.out.println(t.getName());
		Thread.currentThread().setName("MyMAIN");
		t.setName("Dhiraj");
		System.out.println(Thread.currentThread().getName());
		System.out.println(t.getName());
		System.out.println(Thread.currentThread().getPriority());
		t.setPriority(6);
		
		
	}
}
