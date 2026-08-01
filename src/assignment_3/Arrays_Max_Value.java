package assignment_3;

import java.util.Scanner;

public class Arrays_Max_Value {
    // max value
    public static int Arrays_Max(int[] arr){
        int ans = Integer.MIN_VALUE;
        for(int i=0;i< arr.length;i++){
            ans = Math.max(ans,arr[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr =new int[n];
        for(int i =0 ;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays_Max(arr));
    }
}
