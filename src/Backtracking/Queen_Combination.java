package Backtracking;

public class Queen_Combination {
    public static void main(String[] args) {
        int n = 4;  // number of board
        boolean [] board = new boolean[n];
        int tq = 2; // total queen
        combination(board,tq,"",0,0);
    }
    public static void combination(boolean[] board,int tq,String ans,int qpsf,int idx){
        if(qpsf == tq){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < board.length; i++) {
            if(board[i]==false){
                board[i] = true; // mei yaha pe apne se queen placed kr diya hai
                combination(board,tq,ans+"b"+i+"q"+qpsf,qpsf+1,i+1);
                board[i]= false; // mei yaha pe apne se queen remove kr diya hai UNDO
            }
        }
    }
}
