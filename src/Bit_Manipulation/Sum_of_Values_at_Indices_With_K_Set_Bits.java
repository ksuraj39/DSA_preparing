package Bit_Manipulation;

// Leetcode question name -> Sum of Values at Indices With K Set Bits
// question Number -> 2859   , level - easy

import java.util.ArrayList;
import java.util.List;

//   Constraints:
//        * 1 <= nums.length <= 1000
//        * 1 <= nums[i] <= 105
//        * 0 <= k <= 10
public class Sum_of_Values_at_Indices_With_K_Set_Bits {
    public static void main(String[] args) {
        List<Integer> ll = List.of(5, 10, 1, 5, 2);
        int k = 1;
        System.out.println(sumIndicesWithKSetBits(ll,k));

    }
    public static int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int n = nums.size();
        int sum = 0;
        for(int i = 0;i < n;i++){
            int num = i;
            int count = 0;

            while(num != 0){
                count += num & 1;
                num = num >> 1;
            }

            if(count == k){
                sum += nums.get(i);
            }
        }
        return sum;
    }

}
