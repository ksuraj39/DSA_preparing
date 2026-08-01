package Backtracking;

public class RatMazeObstacles {
    public static void main(String[] args) {
        int m = 3,n = 3;
        boolean[][] visited = new boolean[n][m];
        mazePath(visited,0,0,m,n,"");
    }
    public static void mazePath(boolean[][] visited,int r,int c,int er,int ec,String ans){
        if(r < 0 || c < 0 || r > er || c > ec ) return;
        if(r==er && c== ec){
            System.out.println(ans);
            visited[r][c] = false;
            return;
        }

        visited[r][c] = true;
        mazePath(visited,r,c-1,er,ec,ans+'L'); // left
        mazePath(visited,r-1,c,er,ec,ans+'U'); // up
        mazePath(visited,r,c+1,er,ec,ans+'R'); // right
        mazePath(visited,r+1,c,er,ec,ans+'D'); // down
        visited[r][c] = true;
    }
}
