package String_Question;

import java.util.Scanner;

public class Shortest_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(shortestPalindrome(s));
    }
    public static String shortestPalindrome(String s) {
        String ans = "";
        int left = 0,right=s.length()-1;
        while(left < right){
            if(s.charAt(left)==s.charAt(right)){
                ans += s.charAt(left);
                left++;
                right--;
            }
            if(s.charAt(left)!= s.charAt(right)){
                ans += s.charAt(right);
                right--;
            }
        }
        while(right<s.length()){
            ans+=s.charAt(right);
            right++;
        }
        return ans;
    }
}
