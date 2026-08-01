package String_Question;

import java.util.Scanner;

public class Excel_Sheet_Column_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(titleToNumber(s));

    }
    public static int titleToNumber(String columnTitle) {
        int n = columnTitle.length();
        long sum = 0;
        long mul = 1;
        for (int i = n-1;i>=0;i--) {
            int ele = (int)(columnTitle.charAt(i)-'A' +1);
            sum = ele*mul + sum;
            mul *=26;

        }
        return (int)sum;
    }
}

