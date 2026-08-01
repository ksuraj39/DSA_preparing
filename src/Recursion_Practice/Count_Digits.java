package Recursion_Practice;

import java.util.Scanner;

public class Count_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(count(n));

    }
    public static int count(int n){
        if(n==0) return 0;
        return count(n/10) + 1;
    }
}
