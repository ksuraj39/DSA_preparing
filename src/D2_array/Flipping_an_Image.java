package D2_array;

public class Flipping_an_Image {
    public static void main(String[] args) {
        int [][]image = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        int [][] res = flipAndInvertImage(image);

        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        int m = image.length;
        int n = image[0].length;
        for (int i = 0; i < m; i++) {
            int j = 0,k = n-1;
            while(j<k){
                int temp = image[i][k];
                image[i][k] = image[i][j];
                image[i][j] = temp;
                j++;
                k--;
            }
        }
        int [][] result = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(image[i][j]==1){
                    result[i][j] = 0;
                }else{
                    result[i][j] = 1;
                }
            }
        }
        return result;
    }
}
