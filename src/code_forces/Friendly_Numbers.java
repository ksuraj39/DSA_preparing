package code_forces;

import java.util.*;

public class Friendly_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            long  n = sc.nextInt();
            int ans = 0;
            for (long y = 0; y <= n + 90; y++) {
                if((y - sumdigit(y))==n){
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }
    public static int sumdigit(long n){
        int sum = 0;
        while(n>0){
            sum += n%10;
            n /= 10;
        }
        return sum;
    }
}
