package code_forces.Rating800;

import java.util.Scanner;

public class SoldierandBananas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();   // the cost of first bananas
        int n = sc.nextInt();   // number of dollars
        int w = sc.nextInt();   // number of bananas

        int total = k * w * (w + 1) / 2;

        int b = Math.max(total - n , 0);
        System.out.println(b);


    }
}
