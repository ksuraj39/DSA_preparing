package Recursion_Practice;

public class CheckPrime {
    public static void main(String[] args) {
        int n = 9;
        System.out.println(isPrime(n,3));
    }
    public static boolean isPrime(int n,int i){
        if(n==2) return true;
        if(n%2==0 || n<=1) return false;
        if(i*i > n) return true;
        if( i*i<=n && n%i==0) return false;
        return isPrime(n,i+=2);
    }
}
