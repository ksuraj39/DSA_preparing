package Recursion_Practice;

import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(cal(a,b));
    }
    public static int cal(int a,int b){
        if(b==0) return a;
        return cal(b,a%b);
    }
}
