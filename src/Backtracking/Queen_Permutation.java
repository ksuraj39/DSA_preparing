package Backtracking;

public class Queen_Permutation {
    public static void main(String[] args) {
        int n = 4;  // number of board
        boolean [] board = new boolean[n];
        int tq = 2; // total queen
        permutation(board,tq,"",0);
    }
    public static void permutation(boolean[] board,int tq,String ans,int qpsf){
        if(qpsf == tq){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < board.length; i++) {
            if(board[i]==false){
                board[i] = true; // mei yaha pe apne se queen placed kr diya hai
                permutation(board,tq,ans+"b"+i+"q"+qpsf,qpsf+1);
                board[i]= false; // mei yaha pe apne se queen remove kr diya hai UNDO
            }
        }
    }
}
