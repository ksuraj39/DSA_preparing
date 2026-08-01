package Array_leetcode;

import java.util.HashSet;

public class Contains_Duplicate {
    public static void main(String[] args) {
            int[] arr = {1,2,3,1};
        System.out.println(containsDuplicate(arr));
    }
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(!seen.add(nums[i])){
                return true;
            }
        }
        return false;
    }
}
