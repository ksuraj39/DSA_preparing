package maths;

import java.util.Scanner;

public class Factorial_Trailing_Zeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(trailingZeroes(n));
    }
    public static int trailingZeroes(int n) {
            int count = 0;
            while(n>1){
                int rem = n/5;
                count+=rem;
                n/=5;
            }
            return count;
        }
    }
