package assignment_3;

import java.util.Scanner;

public class Running_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        sum_array(arr);
        for (int i =0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void sum_array(int[] arr){
        int sum = 0;
        for (int i=0;i< arr.length;i++){
            sum+=arr[i];
            arr[i]=sum;
        }
    }
}
