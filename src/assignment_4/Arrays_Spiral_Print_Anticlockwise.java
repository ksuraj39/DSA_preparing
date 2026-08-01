package assignment_4;

import java.util.Scanner;

public class Arrays_Spiral_Print_Anticlockwise {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();
        int[][] arr=new int[m][n];
        for (int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j]=scn.nextInt();
            }
        }
        Print(arr);
    }
    public static void Print(int[][]arr){
        int minR = 0;
        int minC = 0;
        int maxR = arr.length-1;
        int maxC = arr[0].length-1;
        int te = arr.length* arr[0].length;
        int co =0;
        while(co<te){
            for (int row = minR; row <=maxR && co<te ; row++) {
                System.out.print(arr[row][minC]+", ");
                co++;
            }
            minC++;
            for (int col = minC; col <= maxC && co<te; col++) {
                System.out.print(arr[maxR][col]+", ");
                co++;
            }
            maxR--;
            for (int row = maxR; row >=minR && co<te ; row--) {
                System.out.print(arr[row][maxC]+", ");
                co++;
            }
            maxC--;
            for (int col = maxC; col >=minC &&co<te ; col--) {
                System.out.print(arr[minR][col]+", ");
                co++;
            }
            minR++;
        }
        System.out.println("END");
    }
}
