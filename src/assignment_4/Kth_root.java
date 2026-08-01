package assignment_4;

import java.util.Scanner;

public class Kth_root {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-->0){
            long n = scn.nextLong();
            int k = scn.nextInt();
            System.out.println(FindRoot(n,k));
        }
    }
    public static long FindRoot(long n,int k){
        long count = 0;
        long low = 1,high = n;
        while(low<=high){
            long mid = low +(high - low)/2;
            long pow = (long)Math.pow(mid,k);
            if(pow<=n){
                count = mid;
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return count;
    }
}
