import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();

		l.add("Balkrishna");
		l.add("Venki");
		l.add("Chiru");
		l.add("Nag");
		l.add("A");
		System.out.println(l);
		ListIterator litr =l.listIterator();
		
		while(litr.hasNext())
		{
			String s=(String)litr.next();
			
			if(s.equals("Venki"))
			{
				litr.remove();
			}
			else if(s.equals("Nag"))
			{
				litr.add("Chitu");
			}
			else if(s.equals("Chiru"))
			{
				litr.set("Charan");
			}
			 
		}
		System.out.println(l);
	}
}
