
public class MyThread extends Thread{
	static Thread mr;
	public static Thread mt;
	public void run() 
	{
		try {
		mt.join();
		}
		catch(InterruptedException e)
		{
		}
		
		for (int i = 1; i < 10; i++) {
			System.out.println("child");
		/*	try {
				Thread.sleep(2000);
			}catch(InterruptedException e)
			{
				
			}
	*/	}
	}
	
}
