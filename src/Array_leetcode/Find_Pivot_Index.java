package Array_leetcode;

public class Find_Pivot_Index {
    public static void main(String[] args) {
        int[]  nums = {2,1,-1};
        System.out.println(pivotIndex(nums));

    }
    public static int pivotIndex(int[] nums) {
        int n = nums.length;
        int rightSum = 0;
        for (int i = 0; i < n; i++) {
            rightSum+=nums[i];
        }
        int leftSum = 0;
        for (int i = 0; i < n ; i++){
            if(leftSum==rightSum-nums[i]){
                return i;
            }
            leftSum += nums[i];
            rightSum -= nums[i];
        }
        return -1;
    }

}
