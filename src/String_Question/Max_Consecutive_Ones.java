package String_Question;

import javax.swing.plaf.metal.MetalTheme;

public class Max_Consecutive_Ones {
    public static void main(String[] args) {
        int[]arr = {1,0,1,1,0,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0,count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==1) {
                count++;
            }
            else {
                ans = Math.max(ans,count);
                count=0;
            }
        }
        ans = Math.max(ans,count);
        return ans;
    }
}
