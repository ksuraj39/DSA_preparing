package Backtracking;

public class climbStairs {
    static int count;
    public static void main(String[] args) {
        int n = 4;
        count = 0;
        climb(n,0);
        System.out.println(count);
    }
    public static void  climb(int n,int sum){
        if(sum == n){
            count++;
            return;
        }
        if(sum > n) return;
        climb(n,sum+1);
        climb(n,sum+2);
    }

}
