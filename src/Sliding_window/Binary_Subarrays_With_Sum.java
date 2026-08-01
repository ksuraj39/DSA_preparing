package Sliding_window;

public class Binary_Subarrays_With_Sum {
    public static void main(String[] args) {
        int []arr = {1,0,1,0,1};
        int goal = 2;
        System.out.println(numSubarraysWithSum(arr,goal));
    }
    public static int numSubarraysWithSum(int[] nums, int goal) {
        int count = 0;
        int si = 0,ei = 0,sum = 0;
        while(ei<nums.length){
            sum += nums[ei];
            while(sum>goal && si<=ei){
                sum -= nums[si];
                si++;
            }

            if(sum==goal){
                count++;
            }
            ei++;
        }
        return count;
    }
}
