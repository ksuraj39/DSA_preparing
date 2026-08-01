package Array_leetcode;

public class Get_the_Maximum_Score {
    public static void main(String[] args) {
        int []nums1 = {2,4,5,8,10};
        int []nums2 = {4,6,8,9};

        System.out.println(maxSum(nums1,nums2));
    }
    public static int maxSum(int[] nums1, int[] nums2) {
        int i=0,j = 0;
        int s1 =0,s2 = 0;
        int ans = 0;
        while(i< nums1.length && j< nums2.length ){
            if(nums1[i]<nums2[j]){
                i++;
            } else if (nums1[i]>nums2[j]) {
                j++;
            } else{
                int sum1 = 0;
                for (int k = s1; k <= i; k++) {
                    sum1 += nums1[k];
                }
                int sum2 = 0;
                for (int k = s2; k <= j; k++) {
                    sum2 += nums2[k];
                }
                ans = ans + Math.max(sum1,sum2);  // max sum add into ans

                // set
                i++;
                j++;
                s1 = i;
                s2 = j;
            }
        }
        // after loop end sum ;
        int sum1 = 0;
        for (int k = s1; k < nums1.length; k++) {
            sum1 += nums1[k];
        }
        int sum2 = 0;
        for (int k = s2; k < nums2.length; k++) {
            sum2 += nums2[k];
        }
        ans = ans + Math.max(sum1,sum2);  // max sum add into ans
        return  ans;
    }
}
