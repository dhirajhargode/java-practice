
class Demo{

	public static void main(String[] args){
		
		Employee e1 = new Employee(1,"Dhiraj",100000.00,'M');
		System.out.println(e1);
		Employee e2 = new Employee(1,"Dhiraj",100000.00,'M');
		System.out.println(e2);
		Employee e = null;
		
		System.out.println("Both same are not :" + e1.equals(e2));
		
		System.out.println("hashCode : " + e1.hashCode());
		System.out.println("hashCode : " + e2.hashCode());
		
		
		
		
	}

}