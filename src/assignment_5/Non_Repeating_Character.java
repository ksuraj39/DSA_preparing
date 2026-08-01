package assignment_5;

import java.util.Scanner;

public class Non_Repeating_Character {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // test number
        int t = sc.nextInt();
        while(t-->0) {
            String s = sc.next();
            repeating_character(s);
        }
    }
    public static void repeating_character(String str){
        int []arr = new int[26];
        // counting all character frequencies
        for (int i = 0; i < str.length() ; i++) {
            char ch = str.charAt(i);
            arr[ch-'a']++;
        }

        // print first repeat character
        for (int i = 0; i < str.length() ; i++) {
            char ch = str.charAt(i);
            if(arr[ch-'a']==1){
                System.out.println(ch);
                return;
            }
        }
        System.out.println(-1);
    }
}
