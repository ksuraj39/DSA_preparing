package Recursion_Practice;

import java.util.Scanner;

public class countNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int num = sc.nextInt();

        System.out.println(countnum(arr,num,0,0));
    }
    public static int countnum(int[]arr,int key ,int count , int idx){
        if(idx == arr.length) return count;
        if(key==arr[idx]) count++;
        return countnum(arr,key,count,idx+1);
    }
}
