package Sliding_window;

public class Minimum_Size_Subarray_Sum {
    public static void main(String[] args) {
        int [] arr = {5,1,3,5,10,7,4,9,2,8};
        int tar = 15;
        System.out.println(minSubArrayLen(tar,arr));
    }
    public static int minSubArrayLen(int target, int[] nums) {
        int si = 0,ei = 0, sum = 0;
        int ans = Integer.MAX_VALUE;

        while(ei< nums.length){
            sum+=nums[ei];
            while(sum>=target){
                ans = Math.min(ans,ei-si+1);
                sum-=nums[si];
                si++;
            }
            ei++;
        }
        return ans==Integer.MAX_VALUE?0:ans;
    }
}
