package code_forces;

import java.util.Scanner;

public class Minimize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){

            int a = sc.nextInt();
            int b = sc.nextInt();

            int res = 100;
            for (int c = a; c <= b; c++) {
                int val = Math.abs(c - a) + Math.abs(c - b);

                res = Math.min(val,res);
            }
            System.out.println(res);
        }
    }
}
