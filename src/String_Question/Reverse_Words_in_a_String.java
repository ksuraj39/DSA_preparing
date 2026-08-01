package String_Question;

import java.util.*;

public class Reverse_Words_in_a_String {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        s = s.trim();
        String[] arr = s.split(" +");
        String ans = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            ans += arr[i] + " ";
        }
        return ans.trim();
    }
}

