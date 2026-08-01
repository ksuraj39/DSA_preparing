package lecture_12;

import java.util.Arrays;

public class Maximum_Gap {
    public static void main(String[] args) {
        int [] arr = {30};
        System.out.println(maximumGap(arr));
    }
    public static int maximumGap(int[] nums) {
        int n = nums.length;
        if(n<2) return 0;
        Arrays.sort(nums);

        int ans = 0;
        for (int i = 1; i < n ; i++) {
            int diff = nums[i]-nums[i-1];
            ans  = Math.max(ans,diff);
        }
        return ans;
    }
}
