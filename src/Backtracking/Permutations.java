package Backtracking;

import java.util.*;

public class Permutations {
    public static void main(String[] args) {
        int []nums = {1,2,3};
        List<List<Integer>> res  =  new ArrayList<>();
        List<Integer> ll = new ArrayList<>();
        boolean []visited = new boolean[nums.length];
        permutation(nums,visited,ll,res);
        System.out.println(res);
    }

    private static void permutation(int[] nums, boolean[]visit,List<Integer> ll, List<List<Integer>> res) {
        if(ll.size() == nums.length){
            res.add(new ArrayList<>(ll));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if(visit[i]) continue;
            visit[i] = true;
            ll.add(nums[i]);
            permutation(nums, visit, ll, res);
            ll.remove(ll.size() - 1);
            visit[i] = false;
        }
    }

}
