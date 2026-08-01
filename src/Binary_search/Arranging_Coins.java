package Binary_search;

import java.util.Scanner;

public class Arranging_Coins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(arrangeCoins(n));
    }
    public static int arrangeCoins(int n) {
        int  ans = 0;
        int low = 1,high = n;
        while(low<high){
            int mid = (high+low)/2;
            int sum = mid*(mid+1)/2;
            if(sum<=n){
                ans = Math.max(ans,mid);
                low = mid+1;
            }else{
                high = mid;
            }
        }
        return ans;
    }
}
