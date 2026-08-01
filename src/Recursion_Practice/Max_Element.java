package Recursion_Practice;

import java.util.Scanner;

public class Max_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(max(arr,arr[0],1));

    }
    public static int max(int[]arr,int maxele , int idx){
        if(idx == arr.length){
            return maxele;
        }
        if(maxele < arr[idx]){
            maxele = arr[idx];
        }
        return max(arr,maxele,idx+1);
    }
}
