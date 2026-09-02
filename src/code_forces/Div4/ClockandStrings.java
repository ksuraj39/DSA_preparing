package code_forces.Div4;

import java.util.Scanner;

public class ClockandStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            if(a > b){
                a = a ^ b;
                b = b ^ a;
                a = a ^ b;
            }

            boolean c_btw = a < c && c < b;
            boolean d_btw = a < d && d < b;

            if(c_btw != d_btw){
                System.out.println("YES");

            }else{
                System.out.println("NO");
            }

        }
    }
}
