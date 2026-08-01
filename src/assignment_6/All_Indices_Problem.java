package assignment_6;

import java.util.Scanner;

public class All_Indices_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        printIdx(arr,0,m);
    }
    public static void printIdx(int[]arr,int idx,int target){
        if(idx == arr.length) return;

        if(arr[idx]==target){
            System.out.print(idx+" ");
        }
        printIdx(arr,idx+1,target);
    }
}
