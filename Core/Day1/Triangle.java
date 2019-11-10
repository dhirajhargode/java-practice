
class Triangle{

	public static void main(String []args){
		
		int rows,cols,no=5;
		
		
		System.out.println("left Upper triangle");
		rows=1;
		while(rows<=5){
			
			cols=1;
			while(cols<=5){
					
				if(cols<=no){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
				cols++;
			}//inner while()
			no--;
			rows++;
			System.out.println();
			
		}//outer while()
			
		
		System.out.println("Right Upper triangle");
		rows=1;
		while(rows<=5){
			
			cols=1;
			while(cols<=5){
					
				if(cols>=rows){
					System.out.print("*");					
				}
				else{
					System.out.print(" ");					
				}
				cols++;
			}//inner while()
			rows++;
			System.out.println();
			
		}//outer while()
			
		
		
		System.out.println("Left Lower triangle");
		
		rows=1;
		while(rows<=5){
			
			cols=1;
			while(cols<=5){
								
				if(cols<=rows){
					System.out.print("*");
				}
				else{
					System.out.print(" ");					
				}
				cols++;
			}//inner while()
			rows++;
			System.out.println();
			
		}//outer while()
			
		no = 5;
		System.out.println("Right Lower triangle");

		rows=1;
		while(rows<=5){
			
			cols=1;
			while(cols<=5){
		
				if(cols>=no){
					System.out.print("*");
					
				}
				else{
					System.out.print(" ");
					
				}
				cols++;
			}//inner while()
			rows++;
			no--;
			System.out.println();
			
		}//outer while()
		
		no = 5;
		System.out.println("left Upper Lower triangle");

		rows=1;
		while(rows<=9){
			
			cols=1;
			while(cols<=5){
		
				if(rows<=5){
					if(cols<=rows){
						System.out.print("*");
					
					}
					else{
						System.out.print(" ");
					
					}
				}else{
									
					if(rows <= 11-no){
						System.out.print("*");
					}
					else{
						System.out.print(" ");					
					}
					
				}
				cols++;
			}//inner while()
			no--;	
			rows++;
			
			System.out.println();
			
		}//outer while()
			
		
		
		
		
	}
	


}

	