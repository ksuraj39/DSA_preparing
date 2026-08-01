package D2_array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Spiral_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int [][]matrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println(spiralOrder(matrix));
    }
    public  static List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> arr = new ArrayList<>();
        int minR = 0;
        int minC = 0;
        int maxR = matrix.length-1;
        int maxC = matrix[0].length-1;
        int te = (maxC+1)*(maxR+1);
        int co = 0;
        while (co<te) {
            for (int i = minC; i <= maxC && co<te; i++) {
                arr.add(matrix[minR][i]);
                co++;
            }
            minR++;

            for (int i = minR; i <= maxR && co<te; i++) {
                arr.add(matrix[i][maxC]);
                co++;
            }
            maxC--;

            for (int i = maxC; i >= minC && co<te; i--) {
                arr.add(matrix[maxR][i]);
                co++;
            }
            maxR--;

            for (int i = maxR; i >= minR && co<te; i--) {
                arr.add(matrix[i][minC]);
                co++;
            }
            minC++;
        }
        return arr;
    }
}
