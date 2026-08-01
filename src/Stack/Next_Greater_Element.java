package Stack;

import java.util.Stack;

public class Next_Greater_Element {
    public static void main(String[] args) {
        int[] nums = {50,5,3,2,8,7,9,11,3};
        int[] ans = nextGreaterElement(nums);
        for (int num : ans) {
            System.out.print(num +" ");
        }

    }
    public static int[] nextGreaterElement(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            while(!st.isEmpty() && nums[i] > nums[st.peek()]){
                ans[st.pop()] = nums[i];
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            ans[st.pop()] = -1;
        }
        return ans;
    }
}
