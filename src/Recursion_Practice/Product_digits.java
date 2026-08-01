package Recursion_Practice;

import java.util.Scanner;

public class Product_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Products(n));

    }
    public static int Products(int n){
        if(n==0) return 1;
        return (n%10) * Products(n/10);
    }
}
