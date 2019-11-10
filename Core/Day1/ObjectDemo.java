class ObjectDemo{

	public String name = "Dhiraj ";
	public int no = 50;
	
	


	public static void main(String[] args){
		
		ObjectDemo d =new ObjectDemo();
		
		System.out.println(d.toString());
		
		
	}
	
	public String toString(){
		return name+" "+no;
	}

}