package assignment_6;

import java.util.ArrayList;
import java.util.Scanner;

public class Subset_problem {
    static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        count = 0;

        subset(arr,target,0,0,"");
        System.out.print("\n"+count);
    }
    public static void subset(int[]arr,int target,int idx,int sum ,String ans){
        if(sum == target){
            System.out.print(ans +" ");
            count++;
            return;
        }
        if(idx == arr.length ) return ;
        if(sum > target ) return ;
        subset(arr,target,idx+1,sum+arr[idx],ans+arr[idx]+" ");
        subset(arr,target,idx+1,sum,ans);

    }
}
