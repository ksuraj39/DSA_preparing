package Recursion_Practice;

public class StringPalindrome {
    public static void main(String[] args) {
        String s = "madem";
        s.toLowerCase();
        int j = s.length()-1;
        System.out.println(Palindrome(s,0,j));
    }
    public static boolean Palindrome(String s,int i,int j){
        if(i > j) return true;
        if(s.charAt(i)!=s.charAt(j)) return false;
        return Palindrome(s,i+1,j-1);
    }
}
