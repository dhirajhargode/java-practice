
 class MyThread extends Thread
 {
	 MyThread(ThreadGroup g,String name)
	 {
		 super(g,name);
	 }
	 
	 @Override
	public void run() {
		 System.out.println("child Thread");
		 try
		 {
			 Thread.sleep(1000);
		 }catch(InterruptedException e)
		 
		 {
			 
		 }
	}
 }

 class ThreadGrpDemo {

	 public static void main(String[] args) {
		ThreadGroup pg=new ThreadGroup("Parent grp");
		ThreadGroup cg=new ThreadGroup(pg, "child grp");
		MyThread t1=new MyThread(pg, "pg c1");
		MyThread t2=new MyThread(pg, "pg c2");
		t1.start();
			t2.start();
		
		System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());
		
		pg.list(); 
			System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());

 
		
	}
}
