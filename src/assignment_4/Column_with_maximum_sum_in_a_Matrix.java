package assignment_4;

import java.util.Scanner;

public class Column_with_maximum_sum_in_a_Matrix {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scn.nextInt();
            }
        }
        System.out.println();
        MaximunSum(matrix);
    }
    public static void MaximunSum(int[][] arr){
        int ans = 0;
        int colIndex = -1;
        for (int col = 0; col < arr[0].length; col++) {
            int sum = 0;
            for (int row = 0; row < arr.length; row++) {
                sum += arr[row][col];
            }
            if(ans<sum) {
                ans = sum;
                colIndex = col;
            }
        }
        System.out.println((colIndex+1)+" "+ans);
    }
}
