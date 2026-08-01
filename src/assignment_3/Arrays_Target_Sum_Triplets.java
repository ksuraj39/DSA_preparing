package assignment_3;

import java.util.Scanner;

public class Arrays_Target_Sum_Triplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr =new int[n];
        for(int i =0 ;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sorting(arr);
        int m = sc.nextInt();
        Arrays_Target(arr,m) ;
    }
    // sorting
    public static void sorting(int[] arr){
        for(int i=1;i<arr.length;i++){
            for(int j = 0;j<arr.length-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    // find  pairs
    public static void Arrays_Target(int[] arr,int num){
        for(int i=0;i< arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                for(int k = j+1;k< arr.length;k++) {
                    if(arr[i]+arr[j]+arr[k]==num){
                        System.out.println(arr[i] + ", " + arr[j] + " and " + arr[k]);
                    }
                }
            }
        }
    }
}
