package maths;

import java.util.Scanner;

public class Smallest_Integer_Divisible_by_K {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        System.out.println(smallestRepunitDivByK(k));
    }
    public static int smallestRepunitDivByK(int k) {
        if(k%2==0 || k%5==0) return -1;

        int pre_rem = 1;
        int count = 1;

        if(pre_rem%k==0) return 1;
        for (int i = 1; i < k ; i++){
            int rem = (pre_rem*10+1)%k;
            count++;
            if(rem==0){
                return count;
            }
            pre_rem = rem;
        }
        return -1;
    }
}
