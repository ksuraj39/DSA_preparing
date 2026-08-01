package maths;

public class Seive_Of_Eratosthese {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(Prime_Seive(n));
    }
    public static int Prime_Seive(int n){
         int[] prime = new int[n+1];
         prime[0]=prime[1] = 1;//is not prime no
        for (int i = 2; i*i <= n ; i++) {
            if(prime[i] == 0){ // ye prime hain no
                for (int j = 2; j*i <= n ; j++) {
                    prime[i*j] = 1;
                }
            }
        }
        int count = 0;
        for (int i = 2; i < n ; i++) {
            if(prime[i] == 0){
                count++;
            }
        }
        return count;
    }
}
