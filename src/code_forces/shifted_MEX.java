package code_forces;

import java.util.Arrays;
import java.util.Scanner;

public class shifted_MEX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // sort
            Arrays.sort(arr);

            int longest = 1;
            int curr = 1;

            for (int i = 1; i < n; i++) {

                if(arr[i]==arr[i-1]){
                    continue;
                } else if (arr[i]==arr[i-1]+1) {
                    curr++;
                }else{
//                    longest = Math.max(longest,curr);
                    curr = 1;
                }
            longest = Math.max(longest,curr);
            }
            System.out.println(longest);
        }
    }
}
