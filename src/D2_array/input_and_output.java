package D2_array;

import java.util.Scanner;

public class input_and_output {
    public static void Display(int[][]arr){
        // output
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextByte();   // row
        int m = sc.nextInt();    // column
        int [][] arr = new int[n][m];

        // input
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        Display(arr);
    }
}
