package maths;

//     Question name : Find Missing Observations
//     Leetcode Number : 2028
//     Level : Medium
/*
    Constraints:
            m == rolls.length
            1 <= n, m <= 10^5
            1 <= rolls[i], mean <= 6

 */

public class FindMissingObservations {
    public static void main(String[] args) {
            int[] roll = {2 ,3,4,3};
            int  mean = 4;
            int n = 2;
            int[] res = missingRolls(roll,mean,n);

            for (int num : res) System.out.print(num +" ");
    }

    /*
            solution : simulation , math
            tc -- 0(n+m) ,   space -- O(n)
     */
    public static int[] missingRolls(int[] rolls, int mean, int n) {
        int m = rolls.length;

        int totalSum = 0;
        for(int num  : rolls)  totalSum += num;

        // remain sum
        int remain = mean * (m + n) - totalSum;

        // check we contruct sum or not
        if(remain <= 0 || 6 * n < remain || remain < n) return new int[]{};

        int [] res = new int[n];
        for(int i = n-1;i >= 0;i--){
            res[i] = remain/n;
            remain -= res[i];
            n--;
        }

        return res;
    }
}
