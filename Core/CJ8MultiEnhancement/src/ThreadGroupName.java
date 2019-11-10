
public class ThreadGroupName {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());


		ThreadGroup g1=new ThreadGroup("Parent grp");
		System.out.println(g1.getParent().getName());
		System.out.println(g1.getName());
		
		ThreadGroup g2 =new ThreadGroup(g1,"child grp");
		System.out.println(g2.getParent().getName());
		System.out.println(g2 .getName());
		
		ThreadGroup g3 =new ThreadGroup(g2 ,"new child grp");
		System.out.println(g3.getParent().getName());
		System.out.println(g3 .getName());
		
		
	}
}
