package assignment_4;

import java.util.Scanner;

public class Mummy_motivational_speech {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        System.out.println(LowerTriangular(arr));
    }
    public static boolean LowerTriangular(int [][] arr){
        int n = arr.length;
        int m = arr[0].length - 1;
        for (int row = 0; row < n; row++) {
            for (int col = row+1; col < m; col++) {
                if(arr[row][col]!=0){
                    return false;
                }
            }
        }
        return true;
    }

}
