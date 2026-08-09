package Array_leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Remove_Duplicates_from_Sorted_Array {
    public static void main(String[] args) {
        int [] nums = {1,1 , 2, 2,2,3,3};
        int s = removeDuplicates(nums);
        System.out.println(s);

        for (int i = 0; i < s; i++) {
            System.out.print(nums[i] + " ");


        }

    }
    public static int removeDuplicates(int[] nums) {
        // brute force
        List<Integer> ll = new ArrayList<>();
        for(int num : nums){
            if(ll.isEmpty() || ll.get(ll.size()-1) != num){
                ll.add(num);
            }
        }

        int idx = 0;
        for(int num : ll){
            nums[idx++] = num;
        }
        return idx;

    }
}
