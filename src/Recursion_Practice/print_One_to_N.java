package Recursion_Practice;

import java.util.Scanner;

public class print_One_to_N {
    public static void main(String[] argsS){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }
    public static void print(int n){
        if(n==0) return ;
        print(n-1);
        System.out.print(n+" ");
    }

}
