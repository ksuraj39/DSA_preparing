package leetcode;

public class Sqrt_x {
    public static int sqrt(int x){
        long left = 1,right = (x/2)+1;
        while(left<=right){
            long mid = left +(right-left)/2;
            long ans = mid*mid;
            if(ans==x){
                return (int) mid;
            } else if (ans<x) {
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return (int)right;
    }
    public static void main(String[] args) {
        int n = 8;
        System.out.println(sqrt(n));
    }
}
