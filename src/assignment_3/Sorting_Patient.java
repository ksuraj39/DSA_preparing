package assignment_3;

import java.util.Scanner;

public class Sorting_Patient {
    //sorting
    public static void sorting(int []arr){
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        int idx = 0;
        for(int i =0;(int)i< arr.length;i++){
            if(arr[i]==0){
                count0++;
            }else if (arr[i]==1){
                count1++;
            }else {
                count2++;
            }
        }
        while(count0-->0) {
            arr[idx]=0;
            idx++;
        }
        while(count1-->0){
            arr[idx]=1;
            idx++;
        }
        while(count2-->0) {
            arr[idx]=2;
            idx++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sorting(arr);

        for(int i = 0;(int)i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
