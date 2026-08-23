package Array_leetcode;



public class PrimeFrequency {
    public static   void main(String[] args) {
        int [] arr = {1,2,3,4,5,4};
        System.out.println(checkPrimeFrequency(arr));
    }
    public static boolean checkPrimeFrequency(int[] nums) {
        int[] freq = new int[101];
        for(int num : nums){
            freq[num]++;
        }

        for(int f : freq){
            if(isPrime(f)) return true;
        }
        return false;
    }
    public static boolean isPrime(int n){
        if(n <= 1) return false;
        if(n == 2) return true;
        if(n % 2 == 0) return false;
        for(int i = 3;i * i <= n;i++){
            if(n % i == 0) return false;
        }
        return true;
    }
}
