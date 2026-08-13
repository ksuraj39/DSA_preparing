package code_forces;

import java.util.Scanner;

public class Lucky {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            String s = sc.next();

            int sum1 = 0,sum2 = 0;
            for (int i = 0; i < 3; i++) {
                sum1 += (s.charAt(i) - '0');
                sum2 += (s.charAt(i+3) - '0');
            }

            System.out.println((sum1 == sum2) ? "YES" : "NO");
        }
    }
}
