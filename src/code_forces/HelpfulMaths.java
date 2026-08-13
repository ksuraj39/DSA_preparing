package code_forces;

import java.util.Scanner;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int[] arr = new int[4];

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                arr[ch - '0']++;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 4; i++) {
            while (arr[i]-- > 0) {
                if (sb.length() > 0) {
                    sb.append("+");
                }
                sb.append(i);
            }
        }

        System.out.println(sb);
    }
}
