package Recursion_Practice;

import java.util.Scanner;

public class Sum_of_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(SumDigits(n));

    }
    public static int SumDigits(int n){
        if(n==0) return 0;
        return (n%10) + SumDigits(n/10);
    }
}
