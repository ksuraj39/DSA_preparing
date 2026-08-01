package Sliding_window;

public class Subarray_Sum_Equals_K {
    public static void main(String[] args) {
        int [] arr = {-1,-1,1};
        int k =1;
        System.out.println(subarraySum(arr,k));
    }
    public static int subarraySum(int[] nums, int k) {
        int si =0,ei = 0,sum =0;
        int res=0;
        while(ei< nums.length){
            sum+=nums[ei];

            while(sum<=0 && si<ei){
                sum-= nums[si];
                si++;
            }

            while(sum>k && si<ei){
                sum-=nums[si];
                si++;
            }
            if(sum==k){
                res++;
            }
            ei++;
        }
        return res;
    }
}
