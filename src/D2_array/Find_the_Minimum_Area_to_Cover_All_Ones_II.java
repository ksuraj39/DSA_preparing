package D2_array;

public class Find_the_Minimum_Area_to_Cover_All_Ones_II {
    public static void main(String[] args) {
        int [][]grid = {{1,0,1},{1,1,1}};
        System.out.println(minimumSum(grid));
    }
    public static int minimumSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int res = Integer.MAX_VALUE;

        //                    ____________________
        //                    |       1          |
        //                    |__________________|
        //                    |       2          |
        //                    |__________________|
        //                    |       3          |
        //                    |__________________|


        // case - 1
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j +1 < n; j++) {
                res = Math.min(res,find_the_minimumArea(grid,0,0,i,m-1)+
                        find_the_minimumArea(grid,i+1,0,j,m-1)+
                        find_the_minimumArea(grid,j+1,0,n-1,m-1));

            }
        }
        //                    ________________________
        //                    |       |       |      |
        //                    |       |       |      |
        //                    |       |       |      |
        //                    |  1    |   2   |  3   |
        //                    |       |       |      |
        //                    |_______|_______|______|

        // case - 2
        for (int i = 0; i < m; i++) {
            for (int j = i+1; j +1 < m; j++) {
                res = Math.min(res,find_the_minimumArea(grid,0,0,n-1,i)+
                        find_the_minimumArea(grid,0,i+1,n-1,j)+
                        find_the_minimumArea(grid,0,j+1,n-1,m-1));

            }
        }

        //                    ________________________
        //                    |           |          |
        //                    |     1     |    2     |
        //                    |___________|__________|
        //                    |                      |
        //                    |          3           |
        //                    |______________________|

        // case - 3
        for (int i = 0; i+1 < n; i++) {
            for (int j = 0; j +1 < m; j++) {
                res = Math.min(res,find_the_minimumArea(grid,0,0,i,j)+
                        find_the_minimumArea(grid,0,j+1,i,m-1)+
                        find_the_minimumArea(grid,i+1,0,n-1,m-1));

            }
        }
        //                    |----------------------|
        //                    |           1          |
        //                    |                      |
        //                    ________________________
        //                    |           |          |
        //                    |     2     |    3     |
        //                    |___________|__________|

        // case - 4
        for (int i = 0; i+1 < n; i++) {
            for (int j = i+1; j +1 < m; j++) {
                res = Math.min(res,find_the_minimumArea(grid,0,0,i,m-1)+
                        find_the_minimumArea(grid,i+1,0,n-1,j)+
                        find_the_minimumArea(grid,i+1,j+1,n-1,m-1));

            }
        }

        //                    |-----------|----------|
        //                    |           |          |
        //                    |     1     |          |
        //                    _____________     3    |
        //                    |           |          |
        //                    |     2     |          |
        //                    |___________|__________|
        // case - 5
        for (int i = 0; i+1 < n; i++) {
            for (int j = 0; j +1 < m; j++) {
                res = Math.min(res,find_the_minimumArea(grid,0,0,i,j)+
                        find_the_minimumArea(grid,i+1,0,n-1,j)+
                        find_the_minimumArea(grid,0,j+1,n-1,m-1));

            }
        }

        //                    |-----------|----------|
        //                    |           |          |
        //                    |           |    2     |
        //                    |     1     |__________|
        //                    |           |          |
        //                    |           |    3     |
        //                    |___________|__________|
        // case - 6
        for (int i = 0; i+1 < n; i++) {
            for (int j = 0; j +1 < m; j++) {
                res = Math.min(res,find_the_minimumArea(grid,0,0,n-1,j)+
                        find_the_minimumArea(grid,0,j+1,i,m-1)+
                        find_the_minimumArea(grid,i+1,j+1,n-1,m-1));

            }
        }
        return res;
    }
    public static int find_the_minimumArea(int[][] grid,int cr,int cc,int er,int ec) {
        int minR = Integer.MAX_VALUE;
        int maxR = Integer.MIN_VALUE;
        int minC = Integer.MAX_VALUE;
        int maxC = Integer.MIN_VALUE;
        for (int i = cr; i <= er; i++) {
            for (int j = cc; j <= ec; j++) {
                if(grid[i][j]==1) {
                    minR = Math.min(minR, i);
                    maxR = Math.max(maxR, i);
                    minC = Math.min(minC, j);
                    maxC = Math.max(maxC, j);
                }
            }
        }
        return (maxR-minR+1)*(maxC-minC+1);
    }
}
