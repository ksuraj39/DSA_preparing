package D2_array;

public class Print_Diagonally {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        int n = mat.length; 
        for(int d = 0;d < 2*n-1;d++){
            for(int i=0;i<n;i++){
                int j = d - i;
                if( j >= 0 && j < n){
                    System.out.print(mat[i][j] +" ");
                }
            }
        }

    }
}
