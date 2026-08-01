package Recursion_Practice;

import java.util.Scanner;

public class sumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(sumArray(arr,0,0));
    }
    public static int sumArray(int[]arr,int sum,int idx){
        if(idx== arr.length) return sum;
        sum += arr[idx];
        return sumArray(arr,sum,idx+1);
    }
}
