package ArrayList;

import java.util.ArrayList;

public class Indexes_of_Subarray_Sum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int tar = 15;
        System.out.println(subarraySum(arr,tar));
    }
    public static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        int si = 0,ei =0,sum=0;

        for (ei = 0; ei < arr.length; ei++) {
            sum+=arr[ei];
            while(sum>target && si<ei){
                sum-=arr[si];
                si++;
            }
            if(sum==target){
                ArrayList<Integer> res = new ArrayList<>();
                res.add(si+1);
                res.add(ei+1);
                return res;
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        res.add(-1);
        return res;
    }
}
