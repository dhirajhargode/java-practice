
class MyCalculator{
	
	public static void main(String[] args) throws Exception{
		
			MyCalculator c = new MyCalculator();
			System.out.println(c.power(0,10));
		
	}
	
	
	public long power(int n , int p) throws Exception {
		
		
		if(n < 0 || p < 0){
			throw new Exception("n or p should not be negative.");
		}
		else if(n == 0 && p == 0){
			throw new Exception("n or p should not be zero.");
			
		}
		if(p == 0 || n == 0)
			return 1;
		
		if(p == 1 ){
			return n;
		}
		return (n * power(n,p-1));
		
		
		
	}
	
}