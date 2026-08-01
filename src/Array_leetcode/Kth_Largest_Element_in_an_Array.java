package Array_leetcode;

import java.util.PriorityQueue;

public class Kth_Largest_Element_in_an_Array {
    public static void main(String[] args) {
        int[] arr = {3,2,1,5,6,4};
        int k = 2;
        System.out.println(findKthNumber(arr,k));

    }
    public static int findKthNumber(int[] nums,int k){
        PriorityQueue<Integer> item = new PriorityQueue<>(k);
        for(int num:nums){
            item.add(num);
            if(item.size()>k){
                item.poll();
            }
        }
        return item.peek();
    }
}
