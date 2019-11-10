class ConcreateClass extends PartialClass{

	public void methodTwo(){
		System.out.println("invoke methodTwo() ");
	}
	
	public static void main(String[] args){
		
		PartialClass p = new ConcreateClass();
		p.methodOne();
		p.methodTwo();
		p.methodThree();
		
		
		
	}

}