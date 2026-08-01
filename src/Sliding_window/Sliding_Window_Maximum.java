package Sliding_window;

public class Sliding_Window_Maximum {
    public static void main(String[] args) {
        int [] arr = {1,-1};
        int k = 1;
        int [] result = maxSlidingWindow(arr,k);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int si = 0;
        int [] ans = new int[nums.length-(nums.length%k)];

        int sum = 0,max = Integer.MIN_VALUE;
        //1st window ka answer
        for (int i = 0; i < k; i++) {
            sum+=nums[i];
            max = Math.max(max,nums[i]);
        }
        ans[si++] = max;
        for (int i = k; i < nums.length; i++) {
            // grow window
            sum+=nums[i];
            // shrink window
            sum-=nums[i-k];
            // updated answer
            ans[si++] = isMax(nums,i-k+1,i);
        }
        return ans;
    }
    public static int isMax(int[]arr,int si,int ei){
        int max = Integer.MIN_VALUE;
        for (int i = si; i <=ei; i++) {
            max = Math.max(arr[i],max);
        }
        return max;
    }
}
