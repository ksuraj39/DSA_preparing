package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class N_Queen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        char [][] board = new char[n][n];
        // fill board with '.'
        for (char[] row : board) {
            Arrays.fill(row, '.');
        }
        List<List<String>> ans = new ArrayList<>();
        List<String> list = new ArrayList<>();
        PlaceQueen(board,n,0 ,list,ans);
        System.out.println(ans);
    }
    public static void PlaceQueen(char[][] board,int tq,int row,List<String> list,List<List<String>> ans){
        if(tq == 0){
            ans.add(new ArrayList<>(list));
//            display(board);
            return;
        }
        for (int col = 0; col < board[0].length; col++) {
            if(isSafe(board,col,row)){
                board[row][col] = 'Q';

                list.add(new String(board[row]));
                PlaceQueen(board,tq-1,row+1,list,ans);
                board[row][col] = '.';
                list.remove(list.size()-1 );
            }
        }
    }
    public static void display(char[][] board){
        System.out.println();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean isSafe(char[][]board,int col,int row){
        // right diagonal
        int i = row;
        int j = col;
        while(i >= 0 && j < board[0].length){
            if(board[i][j] == 'Q'){
                return false;
            }
            i--;
            j++;
        }
        // left diagonal
         i = row;
         j = col;
        while(i >= 0 && j >= 0){
            if(board[i][j] == 'Q'){
                return false;
            }
            i--;
            j--;
        }
        // up word
        i = row;
        j = col;
        while(i >= 0){
            if(board[i][j] == 'Q'){
                return false;
            }
            i--;
        }
        return true;
    }
}
