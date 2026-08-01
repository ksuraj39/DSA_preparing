package Stack;

import java.util.Stack;

public class Largest_Rectangle_in_Histogram {
    public static void main(String[] args) {
        int[]heights = {2,1,5,6,2,3};
        System.out.println(largestRectangleArea(heights));
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
