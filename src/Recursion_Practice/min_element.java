package Recursion_Practice;

import java.util.Scanner;

public class min_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(min(arr,arr[0],1));

    }
    public static int min(int[]arr,int minele , int idx){
        if(idx == arr.length){
            return minele;
        }
        if(minele >  arr[idx]){
            minele = arr[idx];
        }
        return min(arr,minele,idx+1);
    }
}
