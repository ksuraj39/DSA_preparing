package Recursion_Practice;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPalindrome(n));

    }
    public static boolean isPalindrome(int n){
        if(n<0) return false;
        int rev = reverse(n,0);
        return rev==n;
    }
    public static int reverse(int n,int rev){
        if(n==0) return rev;
        return reverse(n/10 ,rev*10 + n%10);
    }
}
