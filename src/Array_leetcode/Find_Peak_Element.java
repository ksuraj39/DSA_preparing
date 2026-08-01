package Array_leetcode;

public class Find_Peak_Element {
    public static void main(String[] args) {
        int []arr = {1,2,1,3,5,6,4};
        System.out.println(findPeakElement_2(arr));

    }
    public static int findPeakElement_2(int[] nums) {
        // approach 2
        int low = 0;
        int high = nums.length-1;
        int ans = nums.length-1;
        while(low<high){
            int mid = (low+high)/2;
            if(nums[mid]>nums[mid+1]){
                ans = mid;
                high = mid;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }

    public static int findPeakElement(int[] nums) {
        // approach 1
        long max = Long.MIN_VALUE;
        int peak_idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>max){
                max = nums[i];
                peak_idx = i;
            }
        }
        return peak_idx;
    }
}
