package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Combination_Sum {
    public static void main(String[] args) {
        int[]candidates = {2,3,6,7};
        int target = 7;

        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        combination(candidates,target,list,0,ans);
        System.out.println(ans);
    }
    public static void combination(int [] candidate,int amount,List<Integer> list,int idx,List<List<Integer>> ans){
        if(amount == 0){
//            System.out.println(list);
            ans.add(new ArrayList<>(list));
            return;
        }
        for (int i = idx; i < candidate.length; i++) {
            if(amount >= candidate[i]){
                list.add(candidate[i]);
                combination(candidate,amount-candidate[i],list,i,ans);
                list.remove(list.size()-1);
            }
        }
    }

}
