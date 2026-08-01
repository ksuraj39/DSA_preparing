//package Backtracking;
//
//import java.util.Scanner;
//
//public class Knight_chessboard_path {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[][] board = new int[n][n];
//        knight(board,0,0,n,1);
//    }
//    public static void knight(int[][]board,int r,int c,int n,int move){
//        if(r < 0 || c<0||r >= n || c >= n)return;
//        if(move == n*n) {
//            board[r][c] = move;
//            print(board);
//            board[r][c] = 0;
//        }
//
//        // knight moves
//        if(board[r][c] != 0){
//            knight(board,);
//        }
//    }
//    public static void print(int[][]baord){
//        for(int []row : baord){
//            for (int n : row){
//                System.out.print(n+" ");
//            }
//            System.out.println();
//        }
//    }
//}
