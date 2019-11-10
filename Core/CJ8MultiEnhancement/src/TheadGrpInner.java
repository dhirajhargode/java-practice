
public class TheadGrpInner {

	
	public static void main(String[] args) {
		ThreadGroup tg=new ThreadGroup("TG");
		Thread t1=new Thread(tg,"T1");
		Thread t2=new Thread(tg,"t2");
		tg.setMaxPriority(3);
		Thread t3=new Thread(tg,"T3");
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		System.out.println(t3.getPriority());
		
				
	}
}
