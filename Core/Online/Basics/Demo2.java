import java.util.ArrayList;
class Demo2{

	public static void main(String[] args){

		ArrayList list = new ArrayList();

		list.add(10);
		list.add(20);
		list.add("Java");
		list.add(1,"Hello");
		
		for(int i = 0 ; i<list.size();i++)
			System.out.println(list.get(i));
		
		
	}

}