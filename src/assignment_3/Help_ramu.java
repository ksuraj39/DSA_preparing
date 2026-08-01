package assignment_3;

import java.util.*;
public class Help_ramu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int c1 = sc.nextInt();
            int c2 = sc.nextInt();
            int c3 = sc.nextInt();
            int c4 = sc.nextInt();
            int n = sc.nextInt();   // size of rickshaws array
            int m = sc.nextInt();     // size of cabs array
            int[] rickshaw = new int[n];
            int[] cab = new int[m];
            for (int i = 0; i < n; i++) {
                rickshaw[i] = sc.nextInt();
            }
            for (int i = 0; i < m; i++){
                cab[i] = sc.nextInt();
            }
            long minCost = calculateMinCost(rickshaw, cab, c1, c2, c3, c4);
            System.out.println(minCost);
            t--;
        }
    }
    public static long calculateMinCost(int[] rickshaw, int[] cab, int c1, int c2, int c3, int c4) {
        long rickshawCost = 0;
        long cabCost = 0;
        for (int i = 0; i < rickshaw.length; i++) {
            rickshawCost += Math.min((long)rickshaw[i] * c1, c2);
        }
        rickshawCost = Math.min(rickshawCost, c3);
        for (int i = 0; i < cab.length; i++) {
            cabCost += Math.min((long)cab[i] * c1, c2);
        }
        cabCost = Math.min(cabCost, c3);
        long totalCost = Math.min(rickshawCost + cabCost, c4);

        return totalCost;
    }
}