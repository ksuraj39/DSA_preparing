package leetcode;

public class divide {

    public static int Divide(int dividend, int divisor) {
        // Handle edge case: overflow
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE; // prevent overflow
        }

        // Determine sign of result
        boolean negative = (dividend < 0) ^ (divisor < 0);

        // Work with positive values (use long to avoid overflow)
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);

        int result = 0;

        while (a >= b) {
            long temp = b, multiple = 1;
            while (a >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }
            a -= temp;
            result += multiple;
        }

        return negative ? -result : result;
    }

    public static void main(String[] args) {
        System.out.println(Divide(10, 3));   // Output: 3
        System.out.println(Divide(43, -8));  // Output: -5
        System.out.println(Divide(-15, 2));  // Output: -7
    }
}

