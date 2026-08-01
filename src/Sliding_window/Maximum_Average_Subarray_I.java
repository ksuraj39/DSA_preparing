package Sliding_window;

public class Maximum_Average_Subarray_I {
    public static void main(String[] args) {
        int [] arr = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println(findMaxAverage(arr,k));
    }
    public static double findMaxAverage(int[] nums, int k) {
        double ans = Double.MIN_VALUE;
        double sum = 0;
        // 1st window ka answer
        for (int i = 0; i < k; i++) {
             sum += nums[i];
        }
        ans = sum/k;

        for (int i = k; i < nums.length ; i++) {
            // grow window
            sum += nums[i];
            // shrink
            sum-=nums[i-k];
            // update answer
            ans = Math.max(ans,sum/k);
        }
        return ans;
    }
}
