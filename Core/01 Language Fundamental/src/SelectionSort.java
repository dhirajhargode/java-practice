package sortingalgo;

import java.util.Arrays;

public class SelectionSort {
public static void main(String[] args) {
	int ar[]= {0,9,8,7,4,5,6,1,2,3};
	int n=ar.length;
	int count=0;
	int min;
	for(int i=0;i<n-1;i++) {
		min=i;
		for(int j=i+1;j<n;j++) {
			if(ar[j]<ar[min]) {
				min=j;
				if(min!=i) {
			int temp=ar[min];
			ar[min]=ar[i];
			ar[i]=temp;
			count++;
				}
			}
		}
	}
	System.out.println(Arrays.toString(ar));
System.out.println(count);
}
}
