package code_forces;

import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = 0;
        int col = 0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 ; j++) {
                int val = sc.nextInt();
                if(val == 1) {
                    row = i;
                    col = j;
                }
            }
        }

        int minOp = Math.abs(row - 3) + Math.abs(3 - col);
        System.out.println(minOp);
    }
}
