package code_forces.Rating800;

import java.util.Scanner;

public class Translation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t  = sc.next();

        if(s.length() != t.length()) {
            System.out.println("NO");
            return;
        }

        int n = s.length();
        for (int i = 0; i < n; i++) {

            if(s.charAt(i) != t.charAt(n - i - 1)){
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }
}
