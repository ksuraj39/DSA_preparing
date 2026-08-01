package Weekly_Contest_469;

import java.util.ArrayList;
import java.util.List;

public class merger_adjacent {
    public static void main(String[] args) {
        int [] arr = {2,1,1,2};
        System.out.println(merge(arr));

    }
    public static List<Long> merge(int[] nums){
        List<Long> adjacent = new ArrayList<>();
        int n = nums.length;
        int i = 0;
        while(i < n-1){
            if(nums[i] != nums[i+1]){
                i++;
            } else if (nums[i] == nums[i+1]) {
                nums[i] += nums[i+1];
                sort(nums,i+1,n);
                n--;
                if(i > 0){
                    i--;
                }
            }
        }
        for (int j = 0; j < n; j++) {
            adjacent.add((long)nums[j]);
        }
        return adjacent;
    }
    private static void sort(int[]nums,int i,int n){
        int num = nums[i];
        while(i<n-1){
            nums[i] = nums[i+1];
            i++;
        }
        nums[i] = num;
    }
}
