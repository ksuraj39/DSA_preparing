package Recursion_Practice;

import java.util.Scanner;

public class lastOccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int num = sc.nextInt();
        System.out.println(lOcc(arr,num,n-1));
    }
    public static int lOcc(int[]arr,int key,int idx){
        if(idx < 0) return -1;
        return arr[idx]==key ? idx : lOcc(arr,key,idx - 1);
    }
}
