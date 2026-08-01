package Strings;

import java.util.Scanner;

public class subString_len {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        subString(s);
    }
    public static void subString(String s){
        for (int len = 1; len <=s.length() ; len++) {
            for (int j = len; j <= s.length(); j++) {
                int i = j-len;
                System.out.println(s.substring(i,j));
            }
            System.out.println();
        }
    }
}
