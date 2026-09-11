package Heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Meeting_Rooms_II {
    public static void main(String[] args) {
        int [][] interval = {{9,30},{5,10},{15,20},{6,9},{2,6},{3,5}};
        Arrays.sort(interval,(a,b) -> a[0] - b[0]);
        for (int i = 0; i < interval.length; i++) {
            System.out.println(interval[i][0] +"     "+interval[i][1]);
        }
    }

    public static int Meeting_Room(int[][] interval){
        Arrays.sort(interval,(a,b) -> a[0] - b[0]);

        PriorityQueue<int[]> pq = new PriorityQueue<>();
        pq.add(interval[0]);
        for (int i = 0; i < interval.length; i++) {

        }
        return -1;
    }
}
