package Recursion;

public class Maze_Path {
    public static void main(String[] args) {
        int n = 3; // row
        int m = 3; // col
        Path(0 ,0, n-1,m-1,"");

    }
//    cr -> Current row
//    cc -> Current col
//    er -> End row
//    ec -> End col
    public static void Path(int cr ,int cc,int er ,int ec,String ans){
        if (er==cr && ec == cc){
            System.out.println(ans);
            return ;
        }
        if(cr>er || cc > ec){
            return;
        }
        Path(cr,cc+1,er,ec,ans +'H');
        Path(cr+1,cc,er,ec,ans +'V');
    }
}
