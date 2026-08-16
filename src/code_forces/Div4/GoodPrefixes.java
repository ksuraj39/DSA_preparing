package code_forces.Div4;

import java.util.Scanner;

public class GoodPrefixes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i]  = sc.nextInt();
            }


            // count good prefix
            long sum = 0;
            int max = 0,ans = 0;
            for (int i = 0; i < n; i++) {
                sum = (long)(sum + arr[i]);
                max = Math.max(max,arr[i]);

                if(sum - max == max){
                    ans++;
                }
            }

            System.out.println(ans);
        }
    }
}
