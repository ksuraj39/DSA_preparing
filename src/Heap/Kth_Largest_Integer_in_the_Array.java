package Heap;

import java.util.PriorityQueue;

public class Kth_Largest_Integer_in_the_Array {
    public static void main(String[] args) {

    }
    public String kthLargestNumber(String[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(String ele : nums){
            pq.add(Integer.parseInt(ele));

            if(pq.size() > k){
                pq.remove();
            }
        }

        return pq.peek().toString();
    }
}
