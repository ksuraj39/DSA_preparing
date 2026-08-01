package assignment_3;

import java.util.Scanner;

public class Rain_Water_Trapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            int [] arr = new int[n];
            for(int i =0 ;i<n;i++){
                arr[i] = sc.nextInt();
            }
            System.out.println(Water_Trapping(arr));
            t--;
        }
    }

    public static int Water_Trapping(int [] arr){
        int n = arr.length;

        // left max
        int[] left_max = new int[n];
        left_max[0] = arr[0];
        for(int i = 1;i<n;i++){
            left_max[i] = Math.max(left_max[i-1],arr[i]);
        }
        // right max
        int [] right_max = new int[n];
        right_max[n-1] = arr[n-1];
        for(int i = n-2;i>=0;i--){
            right_max[i] = Math.max(right_max[i+1],arr[i]);
        }
        // max water contain
        int max_water = 0;
        for(int i =0;i<n;i++){
            max_water=max_water+Math.min(left_max[i],right_max[i])-arr[i];
        }
        return max_water ;
    }
}
