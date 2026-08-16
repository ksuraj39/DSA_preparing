package code_forces.Div4;

import java.util.Scanner;

public class CreatingWords {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            String a = sc.next();
            String b = sc.next();

            char ch = a.charAt(0);
            a = b.charAt(0) + a.substring(1);
            b = ch + b.substring(1);

            System.out.println(a + " " + b);
        }

    }
}
