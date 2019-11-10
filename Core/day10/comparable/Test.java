import java.util.*;
class Test{
	public static void main(String[] args){
		ArrayList<Employee> list = new ArrayList<>();
		Employee e1 = new Employee("A",50);
		Employee e2 = new Employee("D",40);
		Employee e3 = new Employee("S",10);
		Employee e4 = new Employee("W",30);
		Employee e5 = new Employee("E",25);
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		
		Collections.sort(list);
		for(Employee i : list)
			System.out.println(i);
		
		Collections.sort(list, new Employee());
		System.out.println("Comparator Emp class Name sort ");
			for (Employee e : list)
				System.out.println(e);
		}
}