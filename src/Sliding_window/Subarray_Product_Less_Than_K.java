package Sliding_window;

public class Subarray_Product_Less_Than_K {
    public static void main(String[] args) {
        int [] arr = {10,5,2,6};
        int k = 100;
        System.out.println(numSubarrayProductLessThanK(arr,k));
    }
    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        int si=0,ei=0,ans=0,p = 1;
        while(ei<nums.length){
            //window grow
            p *= nums[ei];
            // Maximum sum
            while(p>=k){
                p /= nums[si];
                si++;
            }
            // answer update
            ans =ans+( ei-si+1);
            ei++;
        }
        return ans;

    }
}
