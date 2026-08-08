package code_forces;

import java.util.Scanner;

public class Boy_or_Girl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] freq = new int[26];

        int count = 0;
        for (char ch : s.toCharArray()) {
            if(freq[ch - 'a']++ == 0){
                count++;
            }
        }

        if(count % 2 == 0){
            System.out.println("CHAT WITH HER!");
        }else {
            System.out.println( "IGNORE HIM!" );
        }
    }
}
