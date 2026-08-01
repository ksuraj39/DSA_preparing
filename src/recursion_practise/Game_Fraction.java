package recursion_practise;

import java.util.Scanner;

public class Game_Fraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long p = sc.nextLong();
            long q = sc.nextLong();

            if(q > p && 2*q <= 3*p){
                System.out.println("Bob");
            }else{
                System.out.println("Alice");
            }
        }
    }
}
