package D2_array;

import java.util.ArrayList;

public class multiply_2_matrix {
    public static void main(String[] args) {

    }
    public ArrayList<ArrayList<Integer>> multiply(int[][] mat1, int[][] mat2) {
        // code here
        int n = mat1.length;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ans.add(new ArrayList<>());
            for (int j = 0; j < n; j++) {
                int val = 0;
                for (int k = 0; k < n; k++) {
                    val += (mat1[i][k] * mat2[k][j]);
                }
                ans.get(i).add(val);
            }
        }
        return ans;
    }
}
