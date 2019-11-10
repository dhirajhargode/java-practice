class Calculator{

	public static void main(String[] args){
	
		System.out.println(divisor_sum(8));
	}

	public static int divisor_sum(int n){
     
       int itr = 1;
       int res = 0;
       
       while(itr <= n){
           if(n % itr == 0){
               
               res = res + itr ;
           }
           itr++;
       }
       return res;
    }
}