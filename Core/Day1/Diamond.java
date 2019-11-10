
class Diamond{

	public static void main(String[] args){
		
		int rows,cols;
		int no=10;
		
		
		System.out.println("Inner Diamond ");
		rows=1;
		while(rows<=10){
			
			cols=1;
			while(cols<=10){
				
				if(rows<=5){
					if(cols <= 6-rows || cols >= 5+rows ){
						System.out.print("* ");
					
					}
					else{
						System.out.print("  ");
					}
				}else{
					if(cols <= rows-5 || cols >= 16 - rows ){
						System.out.print("* ");
					
					}
					else{
						System.out.print("  ");
					}
					
				}
				cols++;
			}
			System.out.println();
			rows++;
		}//outer while()
			
		
		
		System.out.println(" \n Outer Diamond ");
		rows=1;
		while(rows<=10){
			
			cols=1;
			while(cols<=10){
				
				if(rows<=5){
					if(cols <= 6-rows || cols >= 5+rows ){
						System.out.print("  ");
					
					}
					else{
						System.out.print("* ");
					}
				}else{
					if(cols <= rows-5 || cols >= 16 - rows ){
						System.out.print("  ");
					
					}
					else{
						System.out.print("* ");
					}
					
				}
				cols++;
			}
			System.out.println();
			rows++;
		}//outer while()
		
	
	
		System.out.println(" \n Outer Diamond ");
		rows=1;
		while(rows<=9){
			
			cols=1;
			while(cols<=9){
				
				if(rows<=5){
					if(cols >= 6-rows && cols <= 4+rows ){
						System.out.print("* ");
					
					}
					else{
						System.out.print("  ");
					}
				}else{
					if(cols >= rows-4 && cols <= 14 - rows ){
						System.out.print("* ");
					
					}
					else{
						System.out.print("  ");
					}
					
				}
				cols++;
			}
			System.out.println();
			rows++;
		}//outer while()
		
	
		System.out.println(" \n left half Diamond ");
		rows=1;
		
			
		while(rows<=9){
			
			cols=1;
			while(cols<=9){
				
				if(rows<=5){
					if(cols <= 11 - rows*2 ){
						System.out.print("*");
					}
					else{
						System.out.print(" ");
						
					}
				}else{
					if(cols <= rows*2-9){
						System.out.print("*");
					
					}
					else{
						System.out.print(" ");
					}
					
				}
				cols++;
			}
			System.out.println();
			rows++;
		}//outer while()
		
		
	}

}