package sortingalgo;

import java.util.Arrays;

public class BubbleSort {
public static void main(String[] args) {
	int ar[]= {12,1,11,50,44,35,10};
	int n=ar.length;
	for(int i=0;i<n-1;i++) {
		for(int j=0;j<(n-1)-i;j++) {
			if(ar[j]>ar[j+1]) {
				int temp=ar[j];
				ar[j]=ar[j+1];
				ar[j+1]=temp;
			}
		}
	}
	System.out.println(Arrays.toString(ar));

	
}
}
