package Recursion_Practice;

import java.util.Scanner;

public class firstOccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int num = sc.nextInt();
        System.out.println(fOcc(arr,num,0));
    }

    public static int fOcc(int[]arr,int key , int idx){
        if(idx== arr.length) return -1;
        return arr[idx]==key ? idx : fOcc(arr,key,idx + 1);
    }
}
