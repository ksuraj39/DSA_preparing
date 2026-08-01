package assignment_6;

import java.util.Scanner;

public class chessboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = chessboard(0,0,n-1,n-1,"");
        System.out.println("\n"+c);
    }
    // cr -> current row
    // cc -> current column
    // er -> end row
    // ec -> end column
    public static int chessboard(int cr,int cc,int er,int ec,String ans){
        // base case
        if(cr > er || cc > ec) return 0;

        if(cr == er && cc == ec){
            System.out.print(ans+"{"+cr+"-"+cc+"}"+" ");
            return 1;
        }

        int count = 0;
        // Knight
        count += chessboard(cr+2,cc+1,er,ec,ans+"{"+cr+"-"+cc+"}K");
        count += chessboard(cr+1,cc+2,er,ec,ans+"{"+cr+"-"+cc+"}K");
        // Rook
        if(cr == 0 || cc == 0 || cr == er || cc==ec){
            //horizontal
            for (int i = 1; i <=ec ; i++) {
                count+=chessboard(cr,cc+i,er,ec,ans+"{"+cr+"-"+cc+"}R");
            }
            // vertical
            for (int i = 1; i <=er ; i++) {
                count+=chessboard(cr+i,cc,er,ec,ans+"{"+cr+"-"+cc+"}R");
            }
        }
        // Bishop
        if(cr == cc || cr+cc == ec){
            for (int i = 1; i <= ec ; i++) {
               count+= chessboard(cr+i,cc+i,er,ec,ans+"{"+cr+"-"+cc+"}B");
            }
        }
        return count;
    }

}
