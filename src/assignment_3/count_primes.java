package assignment_3;

import java.util.Arrays;
import java.util.Scanner;

public class count_primes {
    public static int countPrimes(int n){
        boolean[] prime  = new boolean[n+1];
        Arrays.fill(prime,true);
        prime[0] =prime[1]= false;

        for (int p = 2; p * p <= n; p++) {
            if (prime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    prime[i] = false;
                }
            }
        }
        int count = 0;
        for(int i = 2;i<=n;i++){
            if(prime[i]){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc  =  new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countPrimes(n));
    }
}
