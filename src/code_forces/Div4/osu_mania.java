package code_forces.Div4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class osu_mania {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            char[][] game = new char[n][4];

            for (int i = 0; i < n; i++) {
                String s = sc.next();
                game[i] = s.toCharArray();
            }

            for (int i = n - 1; i >= 0; i--) {
                for (int j = 3; j >= 0; j--) {
                    if (game[i][j] == '#') {
                        System.out.print(j + 1 + " ");
                    }
                }
            }
            System.out.println();
        }
    }
}
