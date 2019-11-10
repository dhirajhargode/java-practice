
class NonStaticFlowExecution {

		int i = 10;
		
		{
			System.out.println("First Non static block...start");
			methodOne();
			System.out.println("First Non static block...end");
		}
		
		NonStaticFlowExecution(){
			System.out.println("Constructor executed");
			
		}
		
		
		public static void main(String[] args){
			
			System.out.println("Main method start");
			NonStaticFlowExecution i = new NonStaticFlowExecution();
			i.methodOne();
			System.out.println("Main method end");
		}
		
		public void methodOne(){
			System.out.println("methodOne start");
			System.out.println("value of i "+i);
			System.out.println("value of j "+j);
			System.out.println("methodOne end");
		}
		
		{
			System.out.println("Second Non static block...start");
			methodOne();
			System.out.println("Second Non static block...end");
		}
			
		int j = 20;
	 
}