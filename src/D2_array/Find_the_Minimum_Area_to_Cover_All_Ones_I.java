package D2_array;

public class Find_the_Minimum_Area_to_Cover_All_Ones_I {
    public static void main(String[] args) {
        int [][] grid = {{0,1,0},{1,0,1}};
        System.out.println(minimumArea(grid));

    }
    public static int minimumArea(int[][] grid) {
        int minR = Integer.MAX_VALUE;
        int maxR = Integer.MIN_VALUE;
        int minC = Integer.MAX_VALUE;
        int maxC = Integer.MIN_VALUE;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
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
    