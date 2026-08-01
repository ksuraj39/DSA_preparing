package Sorting;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,5,4,2,9,0,1,6,7,8};
        for (int n : arr) System.out.print(n+" ");
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int n : arr) System.out.print(n+" ");
    }
}
