package Stack;

import java.util.Stack;

public class Maximal_Rectangle {
    public static void main(String[] args) {
        char[][] matrix =   { { '1', '0', '1', '0', '0' },
                            { '1', '0', '1', '1', '1' },
                            { '1', '1', '1', '1', '1' },
                            { '1', '0', '0', '1', '0' } };

        int [] arr = new int[matrix[0].length];
        int ans = 0;
        for(char [] row : matrix){
            for (int i = 0; i < row.length; i++) {
                if(row[i] == '1'){
                    arr[i]++;
                }else{
                    arr[i] = 0;
                }
            }
            ans = Math.max(ans,largestRectangleArea(arr));
        }
        System.out.println(ans);
    }
    public static int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int ans = 0;

        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && heights[i] < heights[st.peek()]){
                int r = i;
                int h = heights[st.pop()];
                if(st.isEmpty()){
                    ans = Math.max(ans,h*r);
                }else{
                    int l = st.peek();
                    // area of histogram
                    int area = h * (r - l - 1);
                    ans = Math.max(ans,area);
                }
            }
            st.push(i);
        }
        // remain element area
        int r = n;
        while (!st.isEmpty()){
            int h = heights[st.pop()];
            if(st.isEmpty()){
                ans = Math.max(ans,h*r);
            }else{
                int l = st.peek();
                // area of histogram
                int area = h * (r - l - 1);
                ans = Math.max(ans,area);
            }
        }
        return ans;
    }
}
