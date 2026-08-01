package Recursion;

import java.util.Scanner;

public class towerOfHanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        hanoi(n,'A','B','C');
    }
    private static void hanoi(int n,char a,char b,char c){
        if(n==0) return ;
        // n-1 desk from A to B via C
        hanoi(n-1,a,c,b);
        // largest from A to C
        System.out.println("Moving ring "+ n +" from " + a +" to "+c);
        // n-1 disks from B to c via A
        hanoi(n-1,b,a,c);
    }

}
