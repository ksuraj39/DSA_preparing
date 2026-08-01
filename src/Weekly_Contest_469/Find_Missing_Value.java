package Weekly_Contest_469;

import java.util.*;

public class Find_Missing_Value {
    public static void main(String[] args) {

    }
    public static List<Integer> findMissingElements(int[] nums) {
        // find min and max element;
        int min = Integer.MAX_VALUE,max = Integer.MIN_VALUE;
        Set<Integer> seen = new HashSet<>();
        for(int num:nums){
            seen.add(num);
            min = Math.min(min,num);
            max = Math.max(max,num);
        }
        // checking missing number
        List<Integer> missing = new ArrayList<>();
        for (int i = min; i <= max ; i++) {
            if(!seen.contains(i)){
                missing.add(i);
            }
        }
        return missing;
    }
}
