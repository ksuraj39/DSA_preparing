package assignment_4;

import java.util.Scanner;

public class Print_Upper_Triangular_Matrix {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        Upper_Triangular(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static void Upper_Triangular (int[][] arr){
        int m = arr.length-1;
        int n = arr[0].length-2;
         while(m>=1){
            for (int col = 0; col <= n; col++) {
                arr[m][col] = 0;
            }
            n--;
            m--;
        }
    }
}
