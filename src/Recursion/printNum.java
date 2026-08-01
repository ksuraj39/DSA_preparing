package Recursion;

import java.util.Scanner;

// 1 to  n print number
public class printNum {
    static  int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        print(1);
    }
    public static void print(int x ){
        if(x>n) return ;
        System.out.print(x + " ");
        print(x+1);
    }
}
