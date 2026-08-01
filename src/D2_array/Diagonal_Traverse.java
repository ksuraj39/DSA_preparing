package D2_array;

import java.util.ArrayList;
import java.util.Collections;

public class Diagonal_Traverse {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int[] result = findDiagonalOrder(arr);
        for (int i = 0; i < result.length ; i++) {
            System.out.print(result[i]+" ");
        }
    }
    public static int[] findDiagonalOrder(int[][]mat){
        int row = mat.length;
        int col = mat[0].length;
        int [] ans = new int[row*col];
        int idx = 0;

        for (int d = 0; d < row+col-1; d++) {
            int r,c;
            if(d<col){
                r = 0;
                c = d;
            }else{
                r = d-col+1;
                c = col-1;
            }
            ArrayList<Integer> res = new ArrayList<>();
            while(r < row && c >= 0){
                // mat[r][c]   --->  add or print
                res.add(mat[r][c]);
                r++;
                c--;
            }
            if(d%2 != 0){
                for (int ele : res) {
                    ans[idx] = ele;
                    idx++;
                }
            }else{
                Collections.reverse(res);
                for(int ele:res){
                    ans[idx] = ele;
                    idx++;
                }
            }
        }
        return ans;
    }
}
