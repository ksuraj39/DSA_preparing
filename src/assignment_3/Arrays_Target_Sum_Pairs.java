package assignment_3;

import java.util.Scanner;

public class Arrays_Target_Sum_Pairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr =input(n);
        int m = sc.nextInt();
        Arrays_Target(arr,m) ;
    }
    // find  pairs
    public static void Arrays_Target(int[] arr,int num){
        for(int i=0;i< arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                if(arr[i]+arr[j]==num){
                    if(arr[i]>arr[j]){
                        System.out.println(arr[j]+" and "+arr[i]);
                    }else {
                        System.out.println(arr[i] + " and " + arr[j]);
                    }
                }
            }
        }
    }


    // input fuction
    public static int[] input(int n){
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[n];
        for (int i = 0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
}
