package Binary_search;

public class count_prime {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(countPrime(n));
    }
    public static int countPrime(int n){
        int count =0;
        for (int i = 2; i < n; i++) {
            if(prime(i)){
                count++;
            }
        }
        return count;
    }
    public static boolean prime(int n){
        if(n<=1) return false;
        if(n==2) return true;
        if(n%2==0) return  false;

        for (int i = 3; i*i <= n; i+=2) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}

