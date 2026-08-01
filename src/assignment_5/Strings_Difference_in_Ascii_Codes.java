package assignment_5;

import java.util.Scanner;

public class Strings_Difference_in_Ascii_Codes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for (int i = 0; i < s.length()-1 ; i++) {
            int n = s.charAt(i+1)-s.charAt(i);
            System.out.print(s.charAt(i)+""+n);
        }
        System.out.print(s.charAt(s.length()-1));
    }
}
