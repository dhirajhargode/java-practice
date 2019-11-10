class Add{
	int num1;
	int num2;
	
	Add(int n1 , int n2){
		num1 = n1;
		num2 = n2;
	}
	
	int addNum(){
		return num1+num2;
	}
}

class ArrayDemo{
	
	public static void main(String[] args){
		
		
		
		//data type array
		int a[] = new int[5];
		
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		
		for(int x : a)
			System.out.println(x);
		
		int counter = 10;
		for(int i = 0 ; i<a.length ; i++){
			a[i] = counter;
			counter = counter+10 ;
		}
		
		
		for(int x : a)
			System.out.println(x);
		
		
		
		// object array
		int num1 = 10;
		int num2 = 20;
		
		Add a1[] = new Add[3];
		for(int i = 0 ; i<a1.length ; i++){
			a1[i] = new Add(num1,num2);
			num1++;
			num2++;
		}
		
		for(Add as:a1){
			System.out.println("Addition from A class :  "+as.addNum());
		}
		
		// one statement arrray
		int arr1[] = {10,20,30};
		int arr2[][] = {
						 {10,20,30},
						 {40,52,60}
					   };
		
		for(int aa[] : arr2){
			for(int aaa:aa){
				System.out.println("One line " +aaa);
			}
		}
	}
	
	
}