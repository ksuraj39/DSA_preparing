package Recursion_Practice;

import java.util.Locale;

public class countVowels {
    public static void main(String[] args) {
        String s = "codings";
        System.out.println(vowels(s,0,0));
    }
    public static int vowels(String s,int count,int idx){
        if(idx==s.length())return count;
        char ch = s.charAt(idx);
        if(ch == 'a' ||ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u') count++;
        return vowels(s,count,idx+1);
    }
}
