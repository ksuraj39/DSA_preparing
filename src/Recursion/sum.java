package Recursion;

public class sum {
    public static void main(String[] args) {
        System.out.println(sum_nth(5));
    }
    public static int sum_nth(int n){
        if(n <= 1) return n;
        return n+sum_nth(n-1);
    }
}
