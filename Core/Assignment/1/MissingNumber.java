
class MissingNumber{

	void assignArray(int arr[]){
		
		int counter = 1;
		for(int i=0; i<100;i++){
			if(i==15 || i==53 || i== 84){
				counter++;
			}else
				arr[i] = counter++;
		}	
		
	}
	
	void arrayList(int arr[]){
		for(int x : arr)
			System.out.print(x+" ");
	}
	
	void missedNumber(int arr[]){
		int counter = 1;
		System.out.println();
		for(int x : arr){

			if(x==0)
				System.out.println("Missed Number :"+counter);
			counter++;
		}
		
	}


	public static void main(String[] args){
		
		int arr[] = new int[100];
		
		MissingNumber m = new MissingNumber();
		m.assignArray(arr);
		m.arrayList(arr);
		m.missedNumber(arr);
		
		
		
	}

}