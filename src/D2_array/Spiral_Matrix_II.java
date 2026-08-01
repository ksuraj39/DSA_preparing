package D2_array;

public class Spiral_Matrix_II {
    public static void main(String[] args) {
        int n = 5;
        int [][] result = generateMatrix(n);

        for (int i = 0; i <result.length ; i++) {
            for (int j = 0; j < result[0].length ; j++) {
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] generateMatrix(int n) {
        int [][] matrix = new int[n][n];

        int minR = 0;
        int minC = 0;
        int maxR = matrix.length-1;
        int maxC = matrix[0].length-1;
        int te = n*n;
        int co = 1;
        while (co<=te ) {
            for (int i = minC; i <= maxC && co<=te; i++) {
                matrix[minR][i] = co;
                co++;
            }
            minR++;

            for (int i = minR; i <= maxR && co<=te; i++) {
                matrix[i][maxC]=co;
                co++;
            }
            maxC--;

            for (int i = maxC; i >= minC && co<=te; i--) {
              matrix[maxR][i]=co;
                co++;
            }
            maxR--;

            for (int i = maxR; i >= minR && co<=te; i--) {
                matrix[i][minC]=co;
                co++;
            }
            minC++;
        }
        return matrix;
    }

}
