package maths;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            if(a==b){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
    }
}
