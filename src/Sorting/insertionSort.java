package Sorting;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {8,3,4,2,1,5,6,7};
        insertion(arr);
        for(int n : arr) System.out.print(n + " ");

    }
    public static void insertion(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            sort(arr,i);
        }
    }
    public static void sort(int[]arr,int i){
        int item = arr[i];
        int j = i-1;
        while(j>=0 && arr[j] > item){
            arr[j+1] = arr[j];
            arr[j] = item;
            j--;
        }
    }
}
