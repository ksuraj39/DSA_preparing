package code_forces;

import java.util.Scanner;

public class prefix_max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
//            int[] arr = new int[n];
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (x > max) {
                    max = x;
                }
            }
            System.out.println(max * n);
        }
    }
}
