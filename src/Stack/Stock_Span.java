package Stack;

import java.util.Stack;

public class Stock_Span {
    public static void main(String[] args) {
        int[] nums = {50,5,3,2,8,7,9,11,3};
        cal_span(nums);
    }
    public static void cal_span(int []nums){
        Stack<Integer> st = new Stack<>();
        int [] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            while(!st.isEmpty() && nums[i] >= nums[st.peek()]){
                st.pop();
            }
            // span calculate
            if(st.isEmpty()){
                ans[i] = i+1;
            }else{
                ans[i] = i - st.peek();
            }
            st.push(i);
        }
        for (int num : ans){
            System.out.print(num +" ");
        }
    }
}
