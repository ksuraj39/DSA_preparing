package code_forces;

import java.util.HashMap;
import java.util.Scanner;

public class BossFight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();

            HashMap<Integer,Integer> freq = new HashMap<>();

            int totalSum = 0;
            int max_f = 0;
            int max_v = 0;

            for (int i = 0; i < n; i++) {
                int val = sc.nextInt();
                totalSum += val;
                freq.put(val, freq.getOrDefault(val,0)+1);

                if(freq.get(val) > max_f) {
                    max_f = freq.get(val);
                    max_v = val;
                }
            }

            int other  = n - max_f;
            int max_majority_play = Math.min(max_f,other+2);

            long res = (totalSum - (1L* max_f * max_v) + max_majority_play * max_v);
            System.out.println(res);

        }
    }

}
