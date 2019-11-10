package sortingalgo;

public class RecursiveBubbleSort {

   public static void sort(int[] A, int n, int i, int j){
                if(i >= n-1)
                        return;
                if(j < n - 1){
                        sort(A, n, i, j + 1);
                        if(A[j] > A[j+1]){
                              int  swap = A[j];
                                A[j] = A[j+1];
                                A[j+1] = swap;
                        }
                }
                if(j == 0)
                        sort(A, n, i + 1, 0);
        }

        public static void main(String[] args){
                int[] A = {0,9,8,7,6,5,4,3,2,1};
                sort(A, A.length, 0, 0);
                for(int i = 0; i < A.length; i++){
                        System.out.print(A[i] + " ");
                }
        }
	}

