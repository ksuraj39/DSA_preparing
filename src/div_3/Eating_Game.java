package div_3;

import java.util.Scanner;

public class Eating_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int max = -1;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                max = Math.max(max, arr[i]);
            }
            System.out.println(possibleWinner(arr, max));
        }
    }
    public static int possibleWinner(int[]arr,int ele){
        int count = 0;
        for(int num : arr){
            if(num== ele){
                count++;
            }
        }
        return count;
    }
}
