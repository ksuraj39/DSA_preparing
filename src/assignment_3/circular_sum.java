package assignment_3;

import java.util.Scanner;

public class circular_sum {
    // kadane
    public static int kadane(int []arr){
        int maxSum = arr[0];
        int curr = arr[0];

        for(int i = 1;i< arr.length;i++){
            curr = Math.max(arr[i], curr+arr[i]);
            maxSum = Math.max(maxSum,curr);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int [] arr = new int[n];
            int total = 0;

            // take input in array
            for (int i=0;i< n;i++){
                arr[i]= sc.nextInt();
                total += arr[i];
            }

            int max1 = kadane(arr);

            int []arr2 = new int[n];
            for(int i =0;i<n;i++){
                arr2[i] = -arr[i];
            }

            int minSum = -kadane(arr2);

            int max2 = total - minSum;

            if(max1<0){
                System.out.println(max1);
            }else{
                System.out.println(Math.max(max2,max1));
            }
        }
    }
}
