package assignment_5;

import java.util.Scanner;

public class Strings_Count_Palindromic_Substrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(Palindromic_Substrings(s));

    }
    public static String Palindromic_Substrings(String s){
        String maxlen = "";
        int max = 0;
        for (int len = 1; len <= s.length(); len++) {
            for (int j = len; j <= s.length(); j++) {
                int i = j - len;
                int  l = s.substring(i, j).length();
                if (isPalindrome(s,i, j - 1) && max<l) {
                    maxlen = s.substring(i,j);
                    max =l;
                }
            }
        }
        return maxlen;
    }
    public static boolean isPalindrome(String s,int i,int j ){
        //    if(s.length()==1) return true;

        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
