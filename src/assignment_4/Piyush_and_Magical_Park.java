package assignment_4;

import java.util.*;

public class Piyush_and_Magical_Park {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();   // minimun enery
        int s = sc.nextInt();    // maximum enery
        char [][] arr = new char[n][m];

        // input
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                arr[row][col] = sc.next().charAt(0);
            }
        }
        MagicalPark(arr,k,s);
    }
    public static void MagicalPark(char [][] matrix,int k,int s){
        int n = matrix.length;
        int m = matrix[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(matrix[i][j]=='*'){
                    s+=5;
                }
                if(matrix[i][j]=='.'){
                    s -= 2;
                }
                if(matrix[i][j]=='#'){
                    break;
                }
                if(k>s){
                    System.out.println("No");
                    break;
                }
                if(j!=m-1){
                    s--;
                }
            }
        }
        if(s>=k){
            System.out.println("Yes");
            System.out.println(s);
        }
    }
}
