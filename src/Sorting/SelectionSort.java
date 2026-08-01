package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int []arr = {8,4,1,9,-3,6,5};
        selection(arr);
        for(int n : arr){
            System.out.print(n+" ");
        }

    }
    public static void selection ( int [] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int min = Integer.MAX_VALUE;
            int idx = 0;
            for (int j = i; j < n; j++) {
                if(min > arr[j]){
                    min = arr[j];
                    idx = j;
                }
            }
            // swap
            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }
    }
}
