package assignment_3;

import java.util.Scanner;

public class Squares_Sorted_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        Squares(arr);
        sorted(arr);

        for (int i = 0; i<n ; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void sorted(int[] arr){
        for(int i=0;i<arr.length;i++){
            int idx = minimun_index(arr, i);
            int temp = arr[idx];
            arr[idx] = arr[i];
            arr[i] = temp;
        }
    }
    public static int minimun_index(int[] arr, int idx){
        int mini = idx;
        for(int i=idx+1;i<arr.length;i++){
            if(arr[i]<arr[mini]){
                mini=i;
            }
        }
        return mini;
    }

    // squares all element
    public static void Squares(int[] arr){
        for (int i=0;i< arr.length;i++){
            arr[i] = (int) Math.pow(arr[i],2);
        }
    }

}
