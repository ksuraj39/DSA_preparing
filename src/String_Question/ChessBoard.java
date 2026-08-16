package String_Question;

import java.util.Scanner;

public class ChessBoard {
    public static String determineColor(String s) {
        // Write your logic here to determine the color based on the string s.
        char ch = s.charAt(0);
        int num = s.charAt(1) - '0';

        if((ch == 'a' || ch == 'c' || ch == 'e' || ch  == 'g') && (num % 2 == 1)) return "Black";
        if((ch == 'b' || ch == 'd' || ch == 'f' || ch  == 'h') && (num % 2 == 0)) return "Black";

        // Return "Black" or "White" based on the problem statement.
        return "White";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        String result = determineColor(s);
        System.out.println(result);
    }
}
