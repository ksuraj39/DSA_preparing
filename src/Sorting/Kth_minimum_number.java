package Sorting;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class Kth_minimum_number {
    public static void main(String[] args) {
       int[][] matrix = {{1,5,9},{10,11,13},{12,13,15}};
       int k = 8;
        System.out.println(kthSmallest(matrix,k));
    }
    public static int kthSmallest(int[][]matrix,int k){
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(k, Collections.reverseOrder());

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                maxHeap.add(matrix[i][j]);
                if(maxHeap.size()>k){
                    maxHeap.poll();
                }
            }
        }
        return maxHeap.peek();
    }
}
