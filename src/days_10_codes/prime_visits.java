package days_10_codes;

import java.util.Scanner;

public class prime_visits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(Isvisits(a,b));
        }
    }
    public static int Isvisits(int a,int b){
        int count = 0;
        for (int i = a; i <=b ; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }
    public static boolean isPrime(int n){
        if (n<=1) return false;
        if(n==2) return true;
        if (n%2==0) return false;
        for (int i = 3; i*i <=n ; i+=2) {
            if(n%i==0) return false;
        }
        return true;
    }
}
