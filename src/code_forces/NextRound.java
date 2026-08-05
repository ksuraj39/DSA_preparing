package code_forces;

import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;

        int place = arr[k-1];

        for(int num : arr){
            if(num >= place && num > 0){
                count++;

            }
        }

        System.out.println(count);
    }
}
