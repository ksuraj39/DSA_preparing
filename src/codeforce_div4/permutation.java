package codeforce_div4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int c = n;
            int f = 3*n;
            for (int i = 0; i < n; i++) {
                System.out.print(f+" "+(f-1)+" "+ c+" ");
                c--;
                f-=2;
            }
            System.out.println();
        }
    }
}