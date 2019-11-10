class Child{
	
	@Override
	public float m1(){
		System.out.println("child m1");
		return 10.5f;
	}

	public static void main(String[] args){
	
		Parent p = new Child();
		System.out.println(p.m1());
		
	}
	
}