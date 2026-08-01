package D2_array;

public class Matrix_Diagonal_Sum {
    public static void main(String[] args) {

    }
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum  = 0;
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==j||n==i+j){
                    sum+=mat[i][j];
                }
            }
        }
        return sum;
    }
}
