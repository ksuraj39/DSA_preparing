package assignment_5;

import java.util.Scanner;

public class Strings_Max_Frequency_Character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(maxFrequency(str));
    }
    public static char maxFrequency(String s){
        s=s.toLowerCase();
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            arr[ch-'a']++;
        }

        int max = arr[0];
        int idx = 0;
        for (int i = 1; i < 26; i++) {
            if(max<arr[i]){
                max = arr[i];
                idx = i;
            }
        }
        return (char)('a'+idx);
    }
}
