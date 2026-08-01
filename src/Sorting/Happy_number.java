package Sorting;

public class Happy_number {
    public static void main(String[] args) {
        int n = 19;
        System.out.println(isHappy(n));
    }
    public static boolean isHappy(int n) {
        while (n!=1 && n!=4) {
            int sum = 0;
            while (n != 0) {
                int rem = n % 10;
                sum = sum + (int) Math.pow(rem, 2);
                n /= 10;
            }
            n=sum;
        }
        return n==1;
    }
}
