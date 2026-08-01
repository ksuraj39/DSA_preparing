package assignment_4;

import java.util.Scanner;

public class rotate_image {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
//        int n = scn.nextInt();
        int[][] arr=new int[m][m];
        for (int i=0; i<m; i++){
            for(int j=0; j<m; j++){
                arr[i][j]=scn.nextInt();
            }
        }
        Display(arr);
    }
    public static void Display(int[][]arr){
        for(int col = arr[0].length-1;col>=0;col--){
            for (int row = 0;row< arr.length;row++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
    }
}
