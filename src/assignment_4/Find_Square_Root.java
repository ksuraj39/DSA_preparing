package assignment_4;

import java.util.Scanner;

public class Find_Square_Root {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long num = scn.nextLong();
        System.out.println(SquareRoot(num));
    }
    public static long SquareRoot(long n){
        long low = 1,high = n;
        long num = 0;
        while(low<=high){
            long mid = low +(high-low)/2;
            long ans = mid * mid;
            if(ans <= n){
                num = mid;
                low = mid+1;
            }else{
                high = mid - 1;
            }
        }
        return num;
    }
}
