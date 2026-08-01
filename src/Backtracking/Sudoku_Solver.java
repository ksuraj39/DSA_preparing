package Backtracking;

public class Sudoku_Solver {
    public static void main(String[] args) {
        char[][] grid = {
                {'.','8','7','6','5','4','3','2','1'},
                {'2','.','.','.','.','.','.','.','.'},
                {'3','.','.','.','.','.','.','.','.'},
                {'4','.','.','.','.','.','.','.','.'},
                {'5','.','.','.','.','.','.','.','.'},
                {'6','.','.','.','.','.','.','.','.'},
                {'7','.','.','.','.','.','.','.','.'},
                {'8','.','.','.','.','.','.','.','.'},
                {'9','.','.','.','.','.','.','.','.'}
        };
        solver(grid, 0, 0);
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static boolean solver(char[][] grid ,int row,int col){
        if(col == 9){
            col = 0;
            row++;
        }
        if(row == 9){
            return true;
        }

        if(grid[row][col] != '.'){
            return solver(grid,row,col+1);
        }else{
            for (char value = '1'; value <= '9'; value++) {
                if(isSafe(grid,row,col,value)){
                    grid[row][col] =  value;
                    boolean ans = solver(grid,row,col+1);
                    if(ans){
                        return true;
                    }
                    grid[row][col] = '.';
                }
            }
        }
        return false;
    }
    public static boolean isSafe(char[][]grid,int row,int col,char value){
        // row
        for (int c = 0; c < grid.length; c++) {
            if(grid[row][c] == value) return false;
        }
        //col
        for (int r = 0; r < grid.length; r++) {
            if(grid[r][col] == value) return false;
        }
        // 3*3 matrix
        row = row - row%3;
        col = col - col%3;
        for (int r = row; r < row + 3; r++) {
            for (int c = col; c < col +3 ; c++) {
                if(grid[r][c] == value) return false;
            }
        }
        return true;
    }
}
