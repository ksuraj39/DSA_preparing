package Bit_Manipulation;

// leetcode question no : 338
// level - easy
public class counting_bits {
    public static void main(String[] args) {
        int n = 15;
        int []res = countBit(n);

        for (int bit : res) {
            System.out.print(bit + " ");
        }
    }


    // solution  tc - O(n)  space -- O(n+1)
     public static int[] countBit(int n) {
        int []res = new int[n + 1];
         for (int i = 1; i <= n; i++) {
             res[i] = res[i >> 1] + (i & 1);
         }
         return res;
    }

    // solution  tc - O(n*log(n))  space -- O(n+1)
    public static int[] countBit2(int n) {
        int []res = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int count = 0;
            int num = i;
            while(num != 0){
                count += num & 1;
                num = num >> 1;
            }
            res[i] = count;
        }
        return res;
    }
}
