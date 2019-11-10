
class DuplicateNumber{
	
	void assignArray(int arr[]){
		
		int counter = 1;
		for(int i=0; i<arr.length;i++){
			if(i==15 || i==53 || i== 84)
				arr[i] = counter;
			else
				arr[i] = counter++;
		}	
		
	}
	
	void arrayList(int arr[]){
		for(int x : arr)
			System.out.print(x+" ");
	}
	
	void duplicateNumber(int arr[]){
		System.out.println();
		for(int i=0;i<arr.length;i++){
			int count=0;
			for(int j=i+1;j<arr.length;j++){

				if(arr[i] == arr[j] && i!=j){
					count++;
				}
				if(count==1){
					count=0;
					System.out.println("Duplicate no "+arr[i]);
					break;
				}
			}
			
		}
		
	}


	public static void main(String[] args){
		
		int arr[] = new int[100];
		
		DuplicateNumber d = new DuplicateNumber();
		d.assignArray(arr);
		d.arrayList(arr);
		d.duplicateNumber(arr);
		
		
		
	}

}