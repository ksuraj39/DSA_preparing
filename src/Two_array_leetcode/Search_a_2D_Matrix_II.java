package Two_array_leetcode;

public class Search_a_2D_Matrix_II {
    public static void main(String[] args) {
        int[][]arr = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target = 13;
        System.out.println(Search_a_2D(arr,target));
    }
    public static boolean Search_a_2D(int [][]matrix , int target){
        int row = 0;
        int col = matrix[0].length-1;
        while(row< matrix.length && col >=0){
            if(matrix[row][col]==target){
                return true;
            } else if (matrix[row][col]>target) {
                col--;
            }else {
                row++;
            }
        }
        return false;
    }
}
